package beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("beansLifeCycle.xml");

	      Hello obj = (Hello) context.getBean("obj");
	      obj.getMessage();
	      context.registerShutdownHook();
	   }
}
