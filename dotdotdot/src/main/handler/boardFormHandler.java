package main.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class boardFormHandler implements ControlHandler {
	
	public String process(HttpServletRequest request, HttpServletResponse response) {		
		return "/boardForm.jsp";
	}

}
