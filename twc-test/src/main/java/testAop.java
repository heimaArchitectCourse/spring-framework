import aop.pattern.proxy.dynamic.DynamicProxy;
import aop.pattern.proxy.dynamic.IStartBusiness;
import aop.pattern.proxy.dynamic.StartBusinessImpl;
import aop.pattern.proxy.staticproxy.AgentProxy;
import aop.service.Slaver;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: twc
 * @Date 2021/3/27 17:12
 **/
public class testAop {

	 @Test
	 public  void testAspect(){
		 ApplicationContext context =
				 new ClassPathXmlApplicationContext("classpath*:application-aop.xml");
		 Slaver slaver = (Slaver) context.getBean("slaverImpl");
		 //使用代理调用了JdkDynamicAopProxy.invoke
		 slaver.work();
		 System.out.println("over>>>>>>>>>>");
	 }

	/**
	 * @Description  静态代理测试
	 * @Date 2021/3/29 10:03
	 **/
	@Test
	public void testStaticProxy() {
		//目标对象
		aop.pattern.proxy.staticproxy.IStartBusiness target = new aop.pattern.proxy.staticproxy.StartBusinessImpl();
		//代理对象,把目标对象传给代理对象,建立代理关系
		aop.pattern.proxy.staticproxy.IStartBusiness proxy = new AgentProxy(target);
		//调用的时候通过调用代理对象的方法来调用目标对象
		proxy.sing();
	}
	 
	/**
	 * @Description  动态代理测试
	 * @Date 2021/3/29 10:01
	 **/
	@Test
	public void testDynamicProxy() {
		// 目标对象；要代理的真实对象
		IStartBusiness target = new StartBusinessImpl();
		// 我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
		InvocationHandler handler = new DynamicProxy(target);
		/*
		 * 第一个参数：handler这个类的ClassLoader对象来加载我们的代理对象
		 * 第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
		 * 第三个参数handler，我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
		 */

//		生成代理对象
		IStartBusiness iStartBusiness = (IStartBusiness) Proxy.newProxyInstance(handler.getClass().getClassLoader(), target
				.getClass().getInterfaces(), handler);
		iStartBusiness.sing();
	}
}
