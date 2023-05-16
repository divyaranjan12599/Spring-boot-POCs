package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.demohibernate.models.Address;
import com.spring.demohibernate.models.Student;
import com.spring.demohibernate.models.onetomany.Answer1;
import com.spring.demohibernate.models.onetomany.Question1;
import com.spring.demohibernate.models.onetoone.Answer;
import com.spring.demohibernate.models.onetoone.Question;

public class Assessment {
	public static void main(String[] args) throws Exception {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Company.class)
				.addAnnotatedClass(Insurance_Ploicy.class)
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
		
		Company c1 = new Company();
		c1.setId(104);
		c1.setName("c1");

		Insurance_Ploicy i1 = new Insurance_Ploicy();
		i1.setId(102);
		i1.setName("i1");
		
		Insurance_Ploicy i2 = new Insurance_Ploicy();
		i2.setId(103);
		i2.setName("i2");
		
		List<Insurance_Ploicy> policies = new ArrayList<>(Arrays.asList(i1,i2));
		c1.setPolicies(policies);
		
		Person p1 = new Person();
		p1.setName("p1");
		p1.setId(101);
		p1.setPolicy(i1);
		
		Person p2 = new Person();
		p2.setName("p2");
		p2.setPolicy(i1);
		p2.setId(102);
		
		List<Person> persons = new ArrayList<>(Arrays.asList(p1,p2));
		i1.setPersons(persons);
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		session.save(p1);
		session.save(p2);
		session.save(i1);
		session.save(i2);
		session.save(c1);
		
		t.commit();

		session.close();
		factory.close();
	}
}

@Entity
class Company {

	@Id
	private int id;
	private String name;

	@OneToMany
	private List<Insurance_Ploicy> policies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Insurance_Ploicy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Insurance_Ploicy> policies) {
		this.policies = policies;
	}
}

@Entity
class Insurance_Ploicy {

	@Id
	private int id;
	private String name;

	@ManyToOne(mapped_by = "policies")
	private Company company;

	@OneToMany
	private List<Person> persons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}

@Entity
class Person {

	@Id
	private int id;
	private String name;

	private int age;
	private String gender;
	private String education;
	private String occupation;
	private double salary;
	private String habits;

	@ManyToOne(mapped_by = "persons")
	private Insurance_Ploicy policy;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Insurance_Ploicy getPolicy() {
		return policy;
	}

	public void setPolicy(Insurance_Ploicy policy) {
		this.policy = policy;
	}

}