
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: twc
 * @Date 2021/3/11 14:10
 **/
public class applicationContextTest {
	@Test
	public void testRun(){
		// Spring build 成功则可以成功运行
		System.out.println("test run: spring build success ");
	}
	@Test
	public void testApplicationContext(){
				AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Object.class);
	        	System.out.println(ctx);
	}


}
