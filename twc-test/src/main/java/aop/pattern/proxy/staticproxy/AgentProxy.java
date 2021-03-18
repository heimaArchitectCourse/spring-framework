package aop.pattern.proxy.staticproxy;

//代理对象,静态代理
public class AgentProxy implements IStartBusiness {

	//代理类持有一个目标类的对象引用
	private IStartBusiness iStartBusiness;
	//构造注入目标对象
	public AgentProxy(IStartBusiness iStartBusiness) {
		this.iStartBusiness = iStartBusiness;
	}

	@Override
	public void sing() {

		//**********方法前增强****************



		//将请求分派给目标类执行；通过注入进入来的目标对象进行访问
		this.iStartBusiness.sing();



		//**********方法后增强****************
	}
}
