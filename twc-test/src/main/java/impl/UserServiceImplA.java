package impl;

import service.UserService;

//实现类
public class UserServiceImplA implements UserService {
	private UserServiceImplB userServiceImplB;
	public void setUserServiceImplB(UserServiceImplB userServiceImplB) {
		this.userServiceImplB = userServiceImplB;
	}

	@Override
	public String getName() {

		return "在UserServiceImplA的Bean中" +
				"userServiceImplB注入成功>>>>>>>>>"+userServiceImplB;

	}

}
