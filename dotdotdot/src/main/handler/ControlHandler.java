package main.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControlHandler {
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable;
}
