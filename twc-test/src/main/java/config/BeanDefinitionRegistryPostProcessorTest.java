package config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
//调用顺序一：注册bean定义注册后置处理器
//调用顺序一顺序二：注册bean工厂后置处理器
//调用顺序一顺序三：注册bean后置处理器

//动态注册Bean
public class BeanDefinitionRegistryPostProcessorTest implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		//BeanDefinitionRegistry可以给容器注册bean　
		System.out.println("开始调用bean定义注册后置处理器...添加了Object之前的bean数=" + registry.getBeanDefinitionCount());
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Object.class);
		registry.registerBeanDefinition("helloFoo", rootBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
		System.out.println("BeanDefinitionRegistryPostProcessorTest的bean数=" + beanDefinitionCount);
	}
}

