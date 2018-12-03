package login3.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login3.dao.LoginDAO;
import login3.interceptor.LoginDAOAware;
import login3.model.UserInfo;

public class LoginAction implements Action, Preparable, ModelDriven, LoginDAOAware {
	
	UserInfo userinfo;
	LoginDAO logindao;
	
	public String execute() throws Exception {
		System.out.println("dDDDDDDD");
		if(logindao.loginchk(userinfo)) {
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}
	
	public void prepare() {
		userinfo = new UserInfo();
	}
	
	public Object getModel() {
		return userinfo;
	}
	
	public void setLoginDAO(LoginDAO logindao) {
		this.logindao = logindao;
	}
}
