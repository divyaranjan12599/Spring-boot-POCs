package annotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{
	public void teach() {
		System.out.println("Hi,\nI am your Math Teacher.");
	}
}
