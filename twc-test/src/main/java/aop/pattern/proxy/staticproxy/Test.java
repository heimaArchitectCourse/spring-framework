package aop.pattern.proxy.staticproxy;

//静态代理测试
public class Test {
	public static void main(String[] args) {
		//目标对象
		IStartBusiness target = new StartBusinessImpl();
		//代理对象,把目标对象传给代理对象,建立代理关系
		IStartBusiness proxy = new AgentProxy(target);
		//调用的时候通过调用代理对象的方法来调用目标对象
		proxy.sing();
	}

}
