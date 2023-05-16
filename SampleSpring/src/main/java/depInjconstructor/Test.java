package depInjconstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {  
        
//        Resource r=new ClassPathResource("applicationContextConstructor.xml");  
//        BeanFactory factory=new XmlBeanFactory(r);  
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConstructor.xml");  
        Employee s1=(Employee)context.getBean("e1");  
        s1.show();
        
        Employee s2=(Employee)context.getBean("e");  
        s2.show();
        
//        Question q=(Question)context.getBean("q");  
//        q.displayInfo();  
          
    }  
}
