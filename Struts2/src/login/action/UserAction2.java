package login.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;

import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction2 implements Action {
	UserInfo userinfo;
	
	Log log = LogFactory.getLog(UserAction.class);
	
	public String execute() throws Exception {
		log.info(">>>>>>>execute");
		
		UserInfo userinfo = new UserInfo();
		
		log.info(">>>>>>>userinfo object create");
		
		UserDAO userDao = new UserDAO();
		if(userDao.save(userinfo)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	public UserInfo getUserinfo() {
		return userinfo;
	}
	
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
}
