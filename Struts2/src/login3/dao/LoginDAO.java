package login3.dao;

import login3.model.UserInfo;

public class LoginDAO {
	public boolean loginchk(UserInfo userinfo) {
		if("test".equals(userinfo.getId())) {
			System.out.println(userinfo.getId()+"ddd");
			userinfo.setName("홍길동");
			return true;
		} else {
			return false;
		}
	}
}
