package aop.impl;

import aop.service.Slaver;
import org.springframework.stereotype.Service;

@Service
public class SlaverImpl implements Slaver {
	//用来织入AOP的通知方法
	@Override
	public void work() {
		System.out.println("进入实现类work.....");
		try {
			Thread.sleep(1000);
			//此处决定拦截器的走向
//			int  s=1/0;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
