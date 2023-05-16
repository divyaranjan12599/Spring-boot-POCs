package dataAccess.dao;

import java.util.List;

import dataAccess.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int update(Student student);

	public int delete(int studentId);
	
	public Student findById(int studentId);
	
	public List<Student> findByAge(int age);
	
	public List<Student> getAll();
}
