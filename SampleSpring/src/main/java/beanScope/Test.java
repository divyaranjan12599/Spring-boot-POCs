package beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeanScope.xml"); 
		
	    Emp e1=(Emp)context.getBean("obj1");  
	    e1.setName("Divyaranjan");
	    System.out.println(e1.getName());
	    Emp e2=(Emp)context.getBean("obj1");  
	    System.out.println(e2.getName());
	    
	    Emp e3=(Emp)context.getBean("obj2");  
	    e3.setName("Bharath");
	    System.out.println(e3.getName());
	    Emp e4=(Emp)context.getBean("obj2");  
	    System.out.println(e4.getName());
	}	
}
