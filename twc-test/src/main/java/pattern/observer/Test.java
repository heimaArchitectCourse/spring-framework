package pattern.observer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//总结 ：使用bean工厂发布和使用多播器效果是一样的
public class Test {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:application.xml");


//		//***************使用spring的多播器发布**********************
//		ApplicationEventMulticaster applicationEventMulticaster = (ApplicationEventMulticaster) context.getBean("applicationEventMulticaster");
//		applicationEventMulticaster.multicastEvent(new MessageSourceEvent("测试..."));
//***************使用BeanFactory的publishEvent发布*********************
			ApplicationContextListenerPubisher myPubisher = (ApplicationContextListenerPubisher)
		context.getBean("applicationContextListenerPubisher");
		myPubisher.publishEvent(new MessageSourceEvent("测试..."));
	}

}
