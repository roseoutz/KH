package board;

import java.sql.*;
import java.util.*;

public class CommentDBBean {   
	//Singleton Pattern
    private static CommentDBBean instance = new CommentDBBean();
   
    // mvc_commentDBBean mvc_comment = mvc_commentDBBean.getInstance();
    public static CommentDBBean getInstance() {
        return instance;
    }
   
    private CommentDBBean() {
    }
   
    private Connection getConnection() throws Exception {
    	String jdbcDriver = "jdbc:apache:commons:dbcp:/pool";         
        return DriverManager.getConnection(jdbcDriver);
    }
    
    //writePro.jsp
    public void insertComment(CommentDataBean comment) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
		int num=comment.getNum();
		int ref=comment.getRef();
		int re_step=comment.getRe_step();
		int re_level=comment.getRe_level();
		int number=0;
        String sql="";

        try {
            conn = getConnection();

            pstmt = conn.prepareStatement("select max(num) from mvc_comment");
            rs = pstmt.executeQuery();

		    if (rs.next())
		      number=rs.getInt(1)+1;
		    else
		      number=1;
  
		    if (num!=0) //�亯���̶��....
		    { 
		      sql="update mvc_comment set re_step=re_step+1 where ref= ? and re_step> ?";
		      pstmt = conn.prepareStatement(sql);
		      pstmt.setInt(1, ref);
		      pstmt.setInt(2, re_step);
		      pstmt.executeUpdate();
		      re_step=re_step+1;
		      re_level=re_level+1;
		    }else{
		      ref=number;
		      re_step=0;
		      re_level=0;
		    }
            // ������ �ۼ�
            sql = "insert into mvc_comment(num,writer,passwd,reg_date,";
            sql+="ref,re_step,re_level,content,ip) values (mvc_comment_num.NEXTVAL,?,?,?,?,?,?,?,?)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, comment.getWriter());
            pstmt.setString(2, comment.getPasswd());
            pstmt.setTimestamp(3, comment.getReg_date());
            pstmt.setInt(4, ref);
            pstmt.setInt(5, re_step);
            pstmt.setInt(6, re_level);
            pstmt.setString(7, comment.getContent());
            pstmt.setString(8, comment.getIp());

            pstmt.executeUpdate();
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
        	if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
   
    //list.jsp : ����¡�� ���ؼ� ��ü ���̺� �Էµ� ���Ǽ��� �ʿ��ϴ�...!!!
    public int getcommentCount() throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        int x=0;

        try {
            conn = getConnection();
           
            pstmt = conn.prepareStatement("select count(*) from mvc_comment");
            rs = pstmt.executeQuery();

            if (rs.next()) {
               x= rs.getInt(1);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return x;
    }
    
   
    //list.jsp ==> Paging!!! DB�κ��� �������� ����� �޴´�.
    public List getcomments(int start, int end) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List commentList=null;
        try {
            conn = getConnection();
           
            pstmt = conn.prepareStatement(
            "select num,writer,passwd,reg_date,ref,re_step,re_level,content,ip,readcount,r " +
            "from (select num,writer,passwd,reg_date,ref,re_step,re_level,content,ip,readcount,rownum r " +
            "from (select num,writer,passwd,reg_date,ref,re_step,re_level,content,ip,readcount " +
            "from mvc_comment order by ref desc, re_step asc) order by ref desc, re_step asc ) where r >= ? and r <= ? ");
            pstmt.setInt(1, start);
            pstmt.setInt(2, end);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                commentList = new ArrayList(end);
                do{
                  CommentDataBean comment= new CommentDataBean();
                  comment.setNum(rs.getInt("num"));
                  comment.setWriter(rs.getString("writer"));
                  comment.setPasswd(rs.getString("passwd"));
                  comment.setReg_date(rs.getTimestamp("reg_date"));
                  comment.setRef(rs.getInt("ref"));
                  comment.setRe_step(rs.getInt("re_step"));
                  comment.setRe_level(rs.getInt("re_level"));
                  comment.setContent(rs.getString("content"));
                  comment.setIp(rs.getString("ip"));
 
                  commentList.add(comment);
                }while(rs.next());
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return commentList;
    }
        //content.jsp : DB�κ��� ������ �����͸� �����´�.
    public CommentDataBean getcomment(int num) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CommentDataBean comment=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement("select * from mvc_comment where num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                comment = new CommentDataBean();
                comment.setNum(rs.getInt("num"));
                comment.setWriter(rs.getString("writer"));
                comment.setPasswd(rs.getString("passwd"));
                comment.setReg_date(rs.getTimestamp("reg_date"));
                comment.setRef(rs.getInt("ref"));
                comment.setRe_step(rs.getInt("re_step"));
                comment.setRe_level(rs.getInt("re_level"));
                comment.setContent(rs.getString("content"));
                comment.setIp(rs.getString("ip"));    
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
        	if(rs != null) try {rs.close();} catch(SQLException ex){}
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){}
			if(conn != null) try {conn.close();} catch(SQLException ex){}
        }
        return comment;
    }

    //updateForm.jsp : �������� ������ �����͸� �����ö�.
    public CommentDataBean updateGetcomment(int num) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CommentDataBean comment=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(
            "select * from mvc_comment where num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                comment = new CommentDataBean();
                comment.setNum(rs.getInt("num"));
                comment.setWriter(rs.getString("writer"));
                comment.setPasswd(rs.getString("passwd"));
                comment.setReg_date(rs.getTimestamp("reg_date"));
                comment.setRef(rs.getInt("ref"));
                comment.setRe_step(rs.getInt("re_step"));
                comment.setRe_level(rs.getInt("re_level"));
                comment.setContent(rs.getString("content"));
                comment.setIp(rs.getString("ip"));    
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return comment;
    }

    //updatePro.jsp : ���� �����͸� �����ϴ� �޼ҵ�.
    public int updatecomment(CommentDataBean comment) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;

        String dbpasswd="";
        String sql="";
        int x=-1;
        try {
            conn = getConnection();
           
            pstmt = conn.prepareStatement(
            "select passwd from mvc_comment where num = ?");
            pstmt.setInt(1, comment.getNum());
            rs = pstmt.executeQuery();
           
            if(rs.next()){
            	dbpasswd= rs.getString("passwd");
            	if(dbpasswd.equals(comment.getPasswd())){
			        sql="update mvc_comment set writer=?, passwd=?";
			        sql+=", content=? where num=?";
	                pstmt = conn.prepareStatement(sql);
	
	                pstmt.setString(1, comment.getWriter());
	                pstmt.setString(2, comment.getPasswd());
	                pstmt.setString(3, comment.getContent());
	                pstmt.setInt(4, comment.getNum());
	                pstmt.executeUpdate();
	                x= 1;
				}else{
					x= 0;
				}
          }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
        	if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return x;
    }
   
    //deletePro.jsp : ���� �����͸� �����ϴ� �޼ҵ�...
    public int deletecomment(int num, String passwd) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;
        String dbpasswd="";
        int x=-1;
        try {
        	conn = getConnection();

            pstmt = conn.prepareStatement(
            "select passwd from mvc_comment where num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
           
            if(rs.next()){
            	dbpasswd= rs.getString("passwd");
            	if(dbpasswd.equals(passwd)){
            		pstmt = conn.prepareStatement("delete from mvc_comment where num=?");
                    pstmt.setInt(1, num);
                    pstmt.executeUpdate();
                    x= 1; //�ۻ��� ����
				}else
				    x= 0; //��й�ȣ Ʋ��
				}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return x;
    }
}