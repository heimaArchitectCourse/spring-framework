package org.springframework.context.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: twc
 * @Date 2021/3/19 11:20
 **/
public class AbstractApplicationContextTest  extends AbstractApplicationContext{
	@Override
	protected void refreshBeanFactory() throws BeansException, IllegalStateException {
		System.out.println("AbstractApplicationContextTest 被执行");
	}

	@Override
	protected void closeBeanFactory() {

	}

	@Override
	public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
		System.out.println("AbstractApplicationContextTest getBeanFactory被执行");
		return null;
	}
}
