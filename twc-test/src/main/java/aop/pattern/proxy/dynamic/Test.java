package aop.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//动态代理测试
//目标：
//1、知道如何创建动态代理
//2、如何调用了invoke方法（拦截方法会用到当前知识点）
public class Test {

	public static void main(String[] args) {
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

