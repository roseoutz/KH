package login2.dao;

import login2.model.UserInfo;

public class LoginDAO {
	
	public boolean loginChk(UserInfo userinfo) {
		if("test".equals(userinfo.getId())) {
			userinfo.setName("홍길동");
			return true;
		} else {
			return false;
		}
	}
}
