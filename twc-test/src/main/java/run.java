import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: twc
 * @Date 2021/3/11 16:03
 **/
public class run {
	public static void main(String[] args) {
		System.out.println("test run: spring build success ");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Object.class);

	}
}
