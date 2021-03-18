package pattern.observer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;

//在Spring 中使用事件监听机制(事件、监听、发布)
//该类实现ApplicationContextAware接口,得到ApplicationContext对象
// 使用该对象的publishEvent方法发布事件
public class ApplicationContextListenerPubisher implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void publishEvent(ApplicationEvent event) {
		System.out.println("发布事件");
		applicationContext.publishEvent(event);
	}

}
