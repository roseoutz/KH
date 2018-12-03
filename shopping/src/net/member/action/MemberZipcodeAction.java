package net.member.action;
import java.util.*;
import javax.servlet.http.*;
import net.member.db.*;

public class MemberZipcodeAction implements Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("euc-kr");
		ActionForward forward = new ActionForward();
		MemberDAO memberdao = new MemberDAO();
		List zipcodeList = new ArrayList();
		
		String searchdong = request.getParameter("dong");
		zipcodeList = memberdao.searchZipcode(searchdong);
		
		request.setAttribute("zipcodelist", zipcodeList);
		forward.setRedirect(false);
		forward.setPath("./member/member_zipcode.jsp");
		return forward;
		
	}
}
