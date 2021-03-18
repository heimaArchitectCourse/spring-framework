package impl;

import service.UserService;

//实现类
public class UserServiceImplB implements UserService {
	private UserServiceImplA userServiceImplA;

	public void setUserServiceImplA(UserServiceImplA userServiceImplA) {
		this.userServiceImplA = userServiceImplA;
	}

	@Override
	public String getName() {

		return "在UserServiceImplB的Bean中" +
				"userServiceImplA注入成功>>>>>>>>>"+userServiceImplA;

	}



}
