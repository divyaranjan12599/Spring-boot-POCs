package depInjSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {  
        
//        Resource r=new ClassPathResource("applicationContextSetter.xml");  
//        BeanFactory factory=new XmlBeanFactory(r);  
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetter.xml");
          
        Employee e=(Employee)context.getBean("obj");  
        e.display();  
        e.displayInfo();
    }  
}
