package methodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("method-injection.xml");
		
		Company c1=(Company)context.getBean("objSingleton");  
	    c1.setName("ACS");
	    System.out.println(c1.getE().getName()+" "+c1.getName());
	    Company c2=(Company)context.getBean("objSingleton");  
	    System.out.println(c2.getName());
	    
	    Employee e1=(Employee)context.getBean("objPrototype");  
	    e1.setName("Divyaranjan");
	    System.out.println(e1.getName());
	    Employee e2=(Employee)context.getBean("objPrototype");  
	    System.out.println(e2.getName());
	}

}
