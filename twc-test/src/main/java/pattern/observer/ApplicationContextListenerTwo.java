package pattern.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

//在Spring 中使用事件监听机制(事件、监听、发布)
//监听类，在spring配置文件中,注册事件类和监听类
public class ApplicationContextListenerTwo implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		if(event instanceof MessageSourceEvent){
			System.out.println("进入到监听器类---two");
			MessageSourceEvent myEvent=(MessageSourceEvent)event;
			myEvent.print();
		}
	}
}
