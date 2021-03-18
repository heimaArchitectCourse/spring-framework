package aop.pattern.proxy.cglib;
//在Spring的AOP编程中:
//如果加入容器的目标对象有实现接口,用JDK代理
//如果目标对象没有实现接口,用Cglib代理
public class Test {
	public static void main(String[] args) {
		//目标对象
		StartBusinessDao target =  new StartBusinessDao();
		//代理对象
		StartBusinessDao proxy = (StartBusinessDao)new ProxyFactory(target).getProxyInstance();
		//执行代理对象的方法
		proxy.sing();
	}
}
