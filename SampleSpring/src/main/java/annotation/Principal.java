package annotation;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	public void principalInfo() {
		System.out.println("Hi,\nIam your Principal.\nMy name is James Bond.");
	}

}
