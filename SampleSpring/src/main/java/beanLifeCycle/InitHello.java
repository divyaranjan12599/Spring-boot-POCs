package beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

class InitHello implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("beansLifeCycle.xml");
//		try {
//			Hello2 h= (Hello2)bean;
//			h.getMessage();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	    return bean;  // you can return any other object as well
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {	      
		System.out.println("AfterInitialization : " + beanName);
		return bean;  // you can return any other object as well
   }
}
