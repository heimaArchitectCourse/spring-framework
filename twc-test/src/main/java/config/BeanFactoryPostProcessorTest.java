package config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

/**
 * Bean工厂后置处理器
 * 说可以管理我们的bean工厂内所有的beandefinition（未实例化）数据
 * 可以随便的的修改属性（BeanDefinition对应的属性，比如作用域、懒加载、自动注入等）
 * 需要对应xml配置
 */
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {
	/**
	 * 主要是用来自定义修改持有的bean
	 * 参数：beanFactory 其实就是DefaultListableBeanDefinition对象
	 *
	 * @param beanFactory
	 * @throws BeansException
	 */
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		System.out.println("此处调用了BeanFctory后置处理器······");
//		Iterator it = beanFactory.getBeanNamesIterator();
//		System.out.println(it);
//		String[] names = beanFactory.getBeanDefinitionNames();
//		// 获取了所有的bean（只是定义）名称列表
//		for (int i = 0; i < names.length; i++) {
//			String name = names[i];
//			BeanDefinition bd = beanFactory.getBeanDefinition(name);
////			System.out.println(name + " 获取到的Bean定义为: " + bd.getBeanClassName());
//
//		}
	}
}
