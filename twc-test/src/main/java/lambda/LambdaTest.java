package lambda;

import org.springframework.beans.factory.ObjectFactory;

//lambda行为参数化(正常使用)
//lambda行为参数化(使用ObjectFactory)
public class LambdaTest {
	public static void main(String args[]) {
		//ObjectFactory<?> singletonFactory
//		test1(() -> test2());
//		test3("hello,", "lambda", (msg1, msg2) -> System.out.println(msg1 + msg2));


	}
	private static Object test1(ObjectFactory<?> singletonFactory) {
		singletonFactory.getObject();
		return null;
	}
	private static Object test2() {
		System.out.println("SingletonFactory.getObject()进行调用了test2()");
		return null;
	}
	private static void test3(String msg1, String msg2, TestInterFace g) {
		g.get(msg1, msg2);

	}



	@FunctionalInterface
	public interface TestInterFace {
		void get(String msg1, String msg2);

	}
}
