package login3.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import login3.dao.LoginDAO;

public class LoginDAOInterceptor implements Interceptor {
	
	LoginDAO logindao;
	
	public void init() {
		logindao = new LoginDAO();
	}
	
	public void destroy() {
		logindao = null;
	}
	
	public String intercept(ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();
		
		if(action instanceof LoginDAOAware) {
			LoginDAOAware loginDAOaware = (LoginDAOAware)action;
			loginDAOaware.setLoginDAO(logindao);
		}
		
		return invocation.invoke();
	}

}
