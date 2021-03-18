package aop;

import aop.service.Slaver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:application-aop.xml");
		Slaver slaver = (Slaver) context.getBean("slaverImpl");
		//使用代理调用了JdkDynamicAopProxy.invoke
		slaver.work();
		System.out.println("over>>>>>>>>>>");











////Cglib动态代理（不实现接口）
//		SlaverImpl slaver = (SlaverImpl) context.getBean("slaverImpl");
//		//使用代理调用了JdkDynamicAopProxy.invoke
//		slaver.work();


//		System.out.println(">>>>>>>>>>"+slaver);
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Object.class);
//		ApplicationContext context2 =
//				new FileSystemXmlApplicationContext("classpath*:application-aop.xml");
	}


}
