package login.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;

import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction implements Action {
	
	private String name;
	private String addr;
	private String tel;
	
	Log log = LogFactory.getLog(UserAction.class);
	
	public String execute() throws Exception{
		log.info(">>>>>>>execute");
		UserInfo userinfo = new UserInfo();
		
		userinfo.setName(name);
		userinfo.setAddr(addr);
		userinfo.setTel(tel);
		log.info(">>>>>>>>userinfo Object Create");
		
		UserDAO loginDao = new UserDAO();
		
		if(loginDao.save(userinfo)) {
			return SUCCESS;
		} else { 
			return ERROR;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
