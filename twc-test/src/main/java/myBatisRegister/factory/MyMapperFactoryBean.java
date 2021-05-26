package myBatisRegister.factory;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: twc
 * @Date 2021/5/26 10:32
 **/
public class MyMapperFactoryBean implements FactoryBean, InvocationHandler {

	private Class interfaceClass;

	public MyMapperFactoryBean(Class interfaceClass){
		this.interfaceClass = interfaceClass;
	}

	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{interfaceClass},this);
	}

	@Override
	public Class<?> getObjectType() {
		return interfaceClass;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String sql = method.getDeclaredAnnotation(Select.class).value()[0];
		//打印sql
		System.out.println(sql);
		//JDBC去查询数据库，然后返回结果集
		return "哈哈哈哈";
	}

}
