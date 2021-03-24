//import org.testng.annotations.Test;
import org.junit.Test;
import reflect.User;

import java.lang.reflect.Constructor;

/**
 * @Author: twc
 * @Date 2021/3/22 15:34
 **/
public class testReflect {
	/**
	 * @Description
	 * @Date 2021/3/22 15:35
	 **/
	@Test
	public void test() {

		//获取calss类有三种方式
		Class<?> c1 = getClassNameOne();
		Class<?> c2 = getClassNameTwo();
		Class<?> c3 = getClassNameThree();
		//反射生成对象; 有参构造;con1.newInstance("111")
		reflectConstructorToObject(c1, c2, c3);
		//反射生成对象; 无参构造;con1.newInstance
		reflectNoConstructorToObject(c1, c2, c3);
	}



	//forName获取calss
	public static Class<?> getClassNameOne() {
		Class<?> c1 = null;
		try {
			// 方法一：forName
			c1 = Class.forName("reflect.User");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c1.getName());
		return c1;
	}

	//new获取calss
	public static Class<?> getClassNameTwo() {
		Class<?> c2 = null;
		// 方法二
		c2 = new User().getClass();
		System.out.println(c2.getName());
		return c2;
	}

	//.class获取calss
	public static Class<?> getClassNameThree() {
		Class<?> c3 = null;
		// 方法三
		c3 = User.class;
		System.out.println(c3.getName());
		return c3;
	}

	//反射生成对象; 无参构造
	public static void reflectNoConstructorToObject(Class<?> c1, Class<?> c2, Class<?> c3) {
		//反射生成对象; 无参构造
		try {
			System.out.println((User) c1.newInstance());
			System.out.println((User) c2.newInstance());
			System.out.println((User) c3.newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	//反射生成对象; 有参构造
	public static void reflectConstructorToObject(Class<?> c1, Class<?> c2, Class<?> c3) {
		try {
			Constructor<?> con1 = c1.getConstructor(String.class);
			System.out.println((User) con1.newInstance("111"));

			Constructor<?> con2 = c2.getConstructor(String.class);
			System.out.println((User) con2.newInstance("222"));


			Constructor<?> con3 = c3.getConstructor(String.class);
			System.out.println((User) con3.newInstance("333"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
