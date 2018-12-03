package action;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.CommentDBBean;
import board.CommentDataBean;

public class CommentProAction implements CommandAction {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		CommentDataBean comment = new CommentDataBean();
		comment.setRef(Integer.parseInt(request.getParameter("num")));
		comment.setContent(request.getParameter("commentt"));
		comment.setPasswd(request.getParameter("passwd"));
		comment.setWriter(request.getParameter("commenter"));
		comment.setIp(request.getRemoteAddr());
		comment.setReg_date(new Timestamp(System.currentTimeMillis()));
		CommentDBBean dbPro = CommentDBBean.getInstance();
		dbPro.insertComment(comment);
		return "/mvc/content.jsp";
	}
}
