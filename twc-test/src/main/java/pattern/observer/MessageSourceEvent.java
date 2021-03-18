package pattern.observer;

import org.springframework.context.ApplicationEvent;

//在Spring 中使用事件监听机制(事件、监听、发布)
//定义事件
//执行顺序
//1、进入到事件源的有参数构造器
//2、发布事件
//3、进入到监听器类---one
//4、进入到事件源的方法
//5、进入到监听器类---two
//6、进入到事件源的方法
public class MessageSourceEvent extends ApplicationEvent {
	public MessageSourceEvent(Object source) {
		super(source);
		System.out.println("进入到事件源的有参数构造器");
	}

	public void print() {
		System.out.println("进入到事件源的方法");
	}
}
