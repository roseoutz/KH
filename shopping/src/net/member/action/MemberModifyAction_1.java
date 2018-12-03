package net.member.action;
import javax.servlet.http.*;
import net.member.db.*;

public class MemberModifyAction_1 implements Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession(true);
		String id = (String)session.getAttribute("id");
		
		if(id == null) {
			forward.setRedirect(true);
			forward.setPath("./MemberLogin.me");
			return forward;
		}
		
		MemberDAO memberdao = new MemberDAO();
		MemberBean dto = memberdao.getMember(id);
		
		request.setAttribute("member", dto);
		
		forward.setRedirect(false);
		forward.setPath("./member/member_info.jsp");
		return forward;
	}

}
