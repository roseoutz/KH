package login.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction3 implements Action, Preparable, ModelDriven {
	
	UserInfo userinfo;
	Log log = LogFactory.getLog("UserAction.class");
	
	public String execute() throws Exception{
		log.info(">>>>>>>>>>>execute");
		UserInfo userinfo = new UserInfo();
		
		log.info(">>>>>>>>>>>userinfo create");
		
		UserDAO userdao = new UserDAO();
		
		if(userdao.save(userinfo)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	public UserInfo getUserinfo() {
		return userinfo;
	}
	
	public void prepare() throws Exception {
		userinfo = new UserInfo();
	}
	
	public Object getModel() {
		return userinfo;
	}
	
	
	

}
