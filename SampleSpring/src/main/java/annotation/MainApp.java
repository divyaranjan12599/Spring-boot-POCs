package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("beansAnnotations.xml");
//		
//		Student student = (Student) context.getBean("student");
//		System.out.println("Name : " + student.getName() );
//		System.out.println("Age : " + student.getAge() );
//		
//		TextEditor te = (TextEditor) context.getBean("textEditor");
//		te.spellCheck();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		College c = context.getBean("colBean",College.class);
		c.show();
	}
}
   