package config;


import org.springframework.beans.factory.BeanNameAware;

//Aware接口感知到自身的一些属性
//比如实体实现了BeanNameAware接口的类，能够获取到beanname（案例）
//比如实现了ApplicationContextAware接口的类，能够获取到ApplicationContext
// 实现了BeanFactoryAware接口的类，能够获取到BeanFactory对象
public class UserAware implements BeanNameAware {
	private String id;
	private String name;
	private String address;

	//通过感知，获取到了bean的id，如果不实现aware接口，就拿不到这个值
	public void setBeanName(String beanName) {
		//ID保存BeanName的值
		id = beanName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}

}
