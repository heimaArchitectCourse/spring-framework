import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pattern.observer.ApplicationContextListenerPubisher;
import pattern.observer.MessageSourceEvent;

/**
 * @Author: twc
 * @Date 2021/3/18 17:57
 **/

public class tesIoc {
	/**
	 * @Description
	 * @Date 2021/3/22 16:51
	 **/
	@Test
	public void test() {
		System.out.println("test");
	}


	/**
	 * @Description application context上下文
	 *
	 **/
	 @Test
	 public  void  testApplicationContext(){
		 ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		 System.out.println("context的内容为"+context);
	 }


	/**
	 * @Description 监听器
	 * @Date 2021/3/22 15:22
	 **/
	@Test
	public void testApplicationContextListenerPubisher() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		ApplicationContextListenerPubisher myPubisher
				= (ApplicationContextListenerPubisher) context.getBean("applicationContextListenerPubisher");
		myPubisher.publishEvent(new MessageSourceEvent("测试..."));
	}
}
