import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @Author: twc
 * @Date 2021/3/11 16:03
 **/
public class run {
	public static void main(String[] args) {
		//=====================================ioC Demo工程 Run================================================

		//宏观目标：ioC初始化到底做了哪些事情？
		//最终目标：userService这个bean是怎么生成的？

		//1、使用注解
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Object.class);
		//2、使用FileSystemXmlApplicationContext
//		ApplicationContext context =new FileSystemXmlApplicationContext("classpath*:application.xml");
		//3、初始化ioC容器，支持多个xml
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		// （c）从容器中取出Bean的实例，call：AbstractApplicationContext.getBean(java.lang.Class<T>)
		//工厂模式(simple)
//		UserService userService = (UserService) context.getBean("userService");
//		// 这句将输出: hello world
//		System.out.println(userService.getName());

		//=====================================ioC Demo工程 Run================================================




		//=====================================循环依赖工程 Run================================================

//		UserService userService = context.getBean("userServiceImplA",UserService.class);
//		System.out.println(userService.getName());

		//=====================================循环依赖工程 Run================================================


	}
}
