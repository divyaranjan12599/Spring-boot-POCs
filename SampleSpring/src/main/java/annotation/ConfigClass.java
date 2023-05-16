package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@ComponentScan(basePackages = "annotation")
@PropertySource("classpath:properties/college-info.properties")
public class ConfigClass {
	
//	@Bean
//	public Teacher mathTeacherBean() {
//		return new MathTeacher();
//	}
//	
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}
//	
//	@Bean(name = {"colBean","colBeanAnother"})
//	public College collegeBean() {
//		//return new College(principalBean());
//		College col = new College();
//		col.setPrincipal(principalBean());
//		col.setTeacher(mathTeacherBean());
//		return col;
//	}
}
