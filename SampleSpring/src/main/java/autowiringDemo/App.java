package autowiringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAutowiring.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		t.draw();
	}
}
