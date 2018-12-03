package action;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logon.LogonDBBean;
import logon.LogonDataBean;

public class LogonInputProAction implements CommandAction {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable{
		request.setCharacterEncoding("euc-kr");
		
		System.out.println(request.getParameter("zipcode"));
		System.out.println(request.getParameter("address1"+request.getParameter("address2")));
		LogonDataBean member = new LogonDataBean();
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setPasswd(request.getParameter("passwd"));
		member.setJumin1(request.getParameter("jumin1"));
		member.setJumin2(request.getParameter("jumin2"));
		member.setEmail(request.getParameter("email"));
		member.setBlog(request.getParameter("blog"));
		member.setZipcode(request.getParameter("zipcode"));
		member.setAddress(request.getParameter("address1")+request.getParameter("address2"));
		member.setReg_date(new Timestamp(System.currentTimeMillis()));
		
		LogonDBBean dbPro = LogonDBBean.getInstance();
		dbPro.insertMember(member);
		return "/logon/inputPro.jsp";
	}
}
