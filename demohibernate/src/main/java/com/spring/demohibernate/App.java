package com.spring.demohibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.demohibernate.models.Address;
import com.spring.demohibernate.models.Course;
import com.spring.demohibernate.models.Student;
import com.spring.demohibernate.models.onetomany.Answer1;
import com.spring.demohibernate.models.onetomany.Question1;
import com.spring.demohibernate.models.onetoone.Answer;
import com.spring.demohibernate.models.onetoone.Question;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Project started...");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Question.class)
				.addAnnotatedClass(Answer.class)
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Question1.class)
				.addAnnotatedClass(Answer1.class)
				.buildSessionFactory();

		Student st = new Student();
		st.setId(101);
		st.setName("Something");

		Course course = new Course();
		course.setCourse("JAVA");
		course.setCompleted(false);
		st.setCourse(course);
		
		FileInputStream fis = new FileInputStream("src/main/java/images.jfif");
		byte[] data = new byte[fis.available()];
		System.out.println(fis.read(data));
		st.setImage(data);
		
		
		Address ad = new Address();
		ad.setCity("demoCity");
		ad.setState("demoState");
		ad.setId(101);
		ad.setX(110101);
		
		//one to one mapping
		Question q1 = new Question();
		q1.setQid(101);
		q1.setQuestion("demo question1?");
		
		Answer a1 = new Answer();
		a1.setAid(201);
		a1.setAnswer("demo answer1.");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		Question q2 = new Question();
		q2.setQid(102);
		q2.setQuestion("demo question2?");
		
		Answer a2 = new Answer();
		a2.setAid(202);
		a2.setAnswer("demo answer2.");
		a2.setQuestion(q2);
		q2.setAnswer(a2);
		
		//ManyToOne mapping
		Question1 q = new Question1();
		q.setQid(101);
		q.setQuestion("demo question1?");
		
		Answer1 ans1 = new Answer1();
		ans1.setAid(201);
		ans1.setAnswer("demo answer1.");
		ans1.setQuestion(q);
		
		Answer1 ans2 = new Answer1();
		ans2.setAid(202);
		ans2.setAnswer("demo answer2.");
		ans2.setQuestion(q);

		List<Answer1> answers = new ArrayList<Answer1>();
		answers.add(ans1);
		answers.add(ans2);
		q.setAnswers(answers);
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		session.save(st);
		
		session.save(ad);
		
		session.save(a1);
		session.save(q1);
		session.save(a2);
		session.save(q2);
		
		session.save(ans1);
		session.save(ans2);
		session.save(q);
		
		Question1 que = session.get(Question1.class, 101);
		System.out.println("Answers are:");
		for(Answer1 a:que.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
		que.getAnswers().forEach(a->System.out.println(a.getAnswer()));
		
//		Question que = session.get(Question.class,101);
//		System.out.println(que.getQuestion()+"\n"+que.getAnswer().getAnswer());
//		
//		Answer a = session.get(Answer.class, 201);
//		System.out.println(a.getQuestion().getQuestion()+"\n"+a.getAnswer());
//		
//		Student student = session.get(Student.class, 101);
//		System.out.println(student);
//		
//		Address address = session.load(Address.class, 101);
//		System.out.println(address);
		
		t.commit();

		session.close();
		factory.close();
	}
}
