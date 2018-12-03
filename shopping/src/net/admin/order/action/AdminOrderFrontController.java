package net.admin.order.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminOrderFrontController extends HttpServlet {

	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		ActionForward  forward = null;
		Action action = null;
		
		if(command.equals("/AdminOrderList.ao")) {
			action = new AdminOrderListAction();
			try {
				forward = action.execute(request, response);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		} else if(command.equals("/AdminOrderDetail.ao")) {
			action = new AdminOrderDetailAction();
			try {
				forward = action.execute(request, response);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		} else if(command.equals("/AdminOrderModify.ao")) {
			action = new AdminOrderModifyAction();
			try {
				forward = action.execute(request, response);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		} else if(command.equals("/AdminOrderDelete.ao")) {
			action = new AdminOrderDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		if(forward.isRedirect()) {
			response.sendRedirect(forward.getPath());
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
}
