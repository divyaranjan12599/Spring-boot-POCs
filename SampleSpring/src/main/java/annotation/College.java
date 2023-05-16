package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("colBean") //by default class name start with small letter
public class College {
	
	@Value("${college.Name}")
	private String name;
	
	//@Autowired
	private Principal principal;
	
	//@Autowired
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired
	public College(Principal principal,Teacher teacher) {
		this.principal = principal;
		this.teacher = teacher;
	}
//
//	public College() {
//	}

	public void show() {
		System.out.println("College name : "+this.name);
		principal.principalInfo();
		teacher.teach();
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
}
