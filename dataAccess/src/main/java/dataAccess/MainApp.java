package dataAccess;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import dataAccess.dao.StudentDao;
import dataAccess.dao.StudentDaoImpl;
import dataAccess.entities.Student;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Hellooooo.....");
		
		ApplicationContext con = new ClassPathXmlApplicationContext("orm_config.xml");
		
		StudentDao studentDao = con.getBean("studentDaoHybernate",StudentDaoImpl.class);
//		JdbcTemplate jdbcTemplate = con.getBean("jdbcTemplate",JdbcTemplate.class);
//		
//		String query = "insert into student(id,name,age) values(?,?,?)";
//		
//		int result = jdbcTemplate.update(query,21,"somthingg",24);
		
		Student student = new Student(211,"some1",14);
		int result = studentDao.insert(student);
		System.out.println("result :"+result);
//		List<Student> sts = studentDao.getAll(); 
//		sts.forEach((n)->System.out.println(n.getId()+" "+n.getName()+" "+n.getAge()));
//		System.out.println(st.getId()+" "+st.getName()+" "+st.getAge());
	}
}
