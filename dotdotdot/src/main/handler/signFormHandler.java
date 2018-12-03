package main.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signFormHandler implements ControlHandler {
	
	public String process(HttpServletRequest request, HttpServletResponse response) {		
		return "/signForm.jsp";
	}

}
