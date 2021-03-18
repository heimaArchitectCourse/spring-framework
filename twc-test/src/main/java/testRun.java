import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2021/3/18 17:57
 **/

public class testRun {

	 @Test
	 public  void  testApplicationContext(){
		 ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		 System.out.println("context的内容为"+context);
	 }
}
