package net.member.db;
import java.sql.*;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public MemberDAO() {
		try{
			Context initCtx=new InitialContext();
			Context envCtx=(Context)initCtx.lookup("java:comp/env");
			DataSource ds=(DataSource)envCtx.lookup("jdbc/OracleDB");
			conn=ds.getConnection();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public boolean insertMember(MemberBean mb) throws SQLException{
		String sql = null;
		try {
			sql = "insert into member values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mb.getMEMBER_ID());
			pstmt.setString(2, mb.getMEMBER_PW());
			pstmt.setString(3, mb.getMEMBER_NAME());
			pstmt.setInt(4, mb.getMEMBER_JUMIN1());
			pstmt.setInt(5, mb.getMEMBER_JUMIN2());
			pstmt.setString(6, mb.getMEMBER_EMAIL());
			pstmt.setString(7, mb.getMEMBER_EMAIL_GET());
			pstmt.setString(8, mb.getMEMBER_PHONE());
			pstmt.setString(9, mb.getMEMBER_MOBILE());
			pstmt.setString(10, mb.getMEMBER_ZIPCODE());
			pstmt.setString(11, mb.getMEMBER_ADDR1());
			pstmt.setString(12, mb.getMEMBER_ADDR2());
			pstmt.setInt(13, mb.getMEMBER_ADMIN());
			pstmt.setTimestamp(14, mb.getMEMBER_JOIN_DATE());
			pstmt.executeUpdate();
			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null){ pstmt.close();}
		}
		return false;
	}
	
	public int userCheck(String id, String pw) throws SQLException{
		String sql = null;
		int x = -1;
		try{
			sql = "select MEMBER_PW from member where MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String memberpw = rs.getString("MEMBER_PW");
				if(memberpw.equals(pw)) {
					x = 1; // ����
				}else {
					x = 0; // ��й�ȣƲ��
				}
			}else {
				x = -1; // ���̵� ����
			}
			return x;
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null){ pstmt.close(); }
			if(rs != null){ rs.close(); }
			
		}
		return -1;
	}
	
	public int confirmId(String id) throws SQLException{
		String sql = null;
		int x = -1;
		try {
			sql = "select MEMBER_ID from member where MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				x = 1; // ���̵� ����
			}
			else {
				x = -1; // ���̵� ����
			}
			return x;
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null){ pstmt.close(); }
			if(rs != null){ rs.close(); }
			
		}
		return -1;
	}
	
	public MemberBean getMember(String id) throws SQLException{
		MemberBean member = null;
		String sql = null;
		try {
			sql = "select * from member where MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new MemberBean();
				member.setMEMBER_ID(rs.getString("MEMBER_ID"));
				member.setMEMBER_NAME(rs.getString("MEMBER_NAME"));
				member.setMEMBER_JUMIN1(rs.getInt("MEMBER_JUMIN1"));
				member.setMEMBER_JUMIN2(rs.getInt("MEMBER_JUMIN2"));
				member.setMEMBER_EMAIL(rs.getString("MEMBER_EMAIL"));
				member.setMEMBER_EMAIL_GET(rs.getString("MEMBER_EMAIL_GET"));
				member.setMEMBER_MOBILE(rs.getString("MEMBER_MOBILE"));
				member.setMEMBER_PHONE(rs.getString("MEMBER_PHONE"));
				member.setMEMBER_ZIPCODE(rs.getString("MEMBER_ZIPCODE"));
				member.setMEMBER_ADDR1(rs.getString("MEMBER_ADDR1"));
				member.setMEMBER_ADDR2(rs.getString("MEMBER_ADDR2"));
				
				return member;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null){ pstmt.close(); }
			if(rs != null){ rs.close(); }
			
		}
		return null;
	}
	
	public void updateMember(MemberBean member) throws SQLException{
		String sql = null;
		try {
			sql = "update member set MEMBER_PW = ?, MEMBER_NAME = ?, MEMBER_EMAIL = ?, MEMBER_EMAIL_GET = ?, MEMBER_MOBILE = ?,"
					+ "MEMBER_PHONE = ?, MEMBER_ZIPCODE = ?, MEMBER_ADDR1 = ?, MEMBER_ADDR2 = ? where MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMEMBER_PW());
			pstmt.setString(2, member.getMEMBER_NAME());
			pstmt.setString(3, member.getMEMBER_EMAIL());
			pstmt.setString(4, member.getMEMBER_EMAIL_GET());
			pstmt.setString(5, member.getMEMBER_MOBILE());
			pstmt.setString(6, member.getMEMBER_PHONE());
			pstmt.setString(7, member.getMEMBER_ZIPCODE());
			pstmt.setString(8, member.getMEMBER_ADDR1());
			pstmt.setString(9, member.getMEMBER_ADDR2());
			pstmt.setString(10, member.getMEMBER_ID());
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null){ pstmt.close();}
			
		}
	}
	
	public int deleteMember(String id, String pw) throws SQLException{
		String sql = null;
		int x = -1;
		try {
			sql = "select MEMBER_PW from member where MEMBER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String dbPasswd = rs.getString("MEMBER_PW");
				if(dbPasswd.equals(pw)) {
					pstmt = conn.prepareStatement("delete from member where MEMBER_ID = ?");
					pstmt.setString(1, id);
					x = 1;
				}else {
					x = 0;
				}
			}else {
				x = -1;
			}
			return x;
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null){ pstmt.close(); }
			
		}
		return -1;
	}
	
	public MemberBean findId(String name, String jumin1, String jumin2) throws SQLException{
		String sql = null;
		MemberBean member = new MemberBean();
		try {
			sql = "select MEMBER_ID, MEMBER_PW, MEMBER_JUMIN1, MEMBER_JUMIN2 from member where MEMBER_NAME = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String memberJumin1 = rs.getString("MEMBER_JUMIN1");
				String memberJumin2 = rs.getString("MEMBER_JUMIN2");
				
				if(memberJumin1.equals(jumin1) && memberJumin2.equals(jumin2)) {
					member.setMEMBER_ID(rs.getString("MEMBER_ID"));
					member.setMEMBER_PW(rs.getString("MEMBER_PW"));
					
					return member;
				}
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null){ pstmt.close(); }
			if(rs != null){ rs.close(); }
			
		}
		return null;
	}
	
	public boolean isAdmin(String id) {
		String sql = "select MEMBER_ADMIN from MEMBER where MEMBER_ID = ? ";
		int member_admin = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			rs.next();
			member_admin = rs.getInt("MEMBER_ADMIN");
			
			if(member_admin == 1) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List searchZipcode(String searchdong) {
		String sql = "select * from zipcode where dong like ?";
		List zipcodeList = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+searchdong+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String sido = rs.getString("sido");
				String gugun = rs.getString("gugun");
				String dong = rs.getString("dong");
				String ri = rs.getString("ri");
				String bunji = rs.getString("bunji");
				if(ri == null) {
					ri = "";
				}
				if(bunji == null) {
					bunji = "";
				}
				String zipcode = rs.getString("zipcode");
				String addr = sido+ " " + gugun + " " + dong + " " + ri + " " + bunji;
				
				zipcodeList.add(zipcode + "," + addr);
			}
			return zipcodeList;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
