package impl;

import service.UserService;

//实现类
public class UserServiceImpl implements UserService {
//	public   String  name;
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String getName() {
		return "Hello World";
	}

//	public   void  initUser(){
//		System.out.println("初始化>>>>>>>>>>>>>>>>>>>>>"+name);
//	}
}
