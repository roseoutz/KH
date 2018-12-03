package login2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login2.dao.LoginDAO;
import login2.model.UserInfo;

public class LoginAction implements Action, Preparable, ModelDriven {
	
	UserInfo userinfo;
	
	public String execute() throws Exception{
		LoginDAO dao = new LoginDAO();
		if(dao.loginChk(userinfo)) {
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}
	
	public void  prepare() throws Exception {
		userinfo = new UserInfo();
	}
	
	public Object getModel() {
		return userinfo;
	}
}
