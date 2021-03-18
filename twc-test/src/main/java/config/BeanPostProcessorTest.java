package config;

import impl.UserServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Bean后置处理器
 * 对应xml的配置
 */
public class BeanPostProcessorTest implements BeanPostProcessor {
	// 前置处理器
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Class beanClass = bean.getClass();
		if (beanClass == UserServiceImpl.class) {
			System.out.println("此处调用了Bean前置处理器······");
		}
		return bean;
	}

	// 后置处理器
	// --- 此处具体的实现用的是Java中的动态代理
	public Object postProcessAfterInitialization(final Object beanInstance, String beanName) throws BeansException {
		System.out.println("此处调用了Bean后置处理器······");
		// 为当前 bean 对象注册监控代理对象，负责增强 bean 对象方法的能力
		Class beanClass = beanInstance.getClass();
		if (beanClass == UserServiceImpl.class) {
			Object proxy = Proxy.newProxyInstance(beanInstance.getClass().getClassLoader(),
					beanInstance.getClass().getInterfaces(), new InvocationHandler() {
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//							System.out.println("UserService 中的 getName 被拦截了···");
							String result = (String) method.invoke(beanInstance, args);
							//拦截输出>>>>>将接口中方法的返回值全部转成大写
							return result.toUpperCase();
//							return  "3333333333333333";

						}
					});
			return proxy;
		}
		return beanInstance;
	}

}
