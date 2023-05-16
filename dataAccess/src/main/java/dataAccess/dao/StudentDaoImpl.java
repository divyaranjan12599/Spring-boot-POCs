package dataAccess.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dataAccess.entities.Student;
import dataAccess.rowMapper.RowMapperImpl;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into student(id,name,age) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getAge());
		return result;
	}

	public int update(Student student) {
		String query = "update student set name=?, age=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getAge(), student.getId());
		return result;
	}


	public Student findById(int studentId) {
		Student student = new Student(); 
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl(); 
		try {
			student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		} catch (Exception e) {
			System.out.println("Student not found!!!\nException :"+e.toString());
		}
		return student;
	}

	public List<Student> findByAge(int age) {
		String query = "select * from student where age=?";
		RowMapper<Student> rowMapper = new RowMapperImpl(); 
		try {
			return this.jdbcTemplate.query(query,rowMapper,age);
		} catch (Exception e) {
			System.out.println("Students not found!!!\nException :"+e.toString());
		}
		return null;
	}
	
	public List<Student> getAll(){
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl(); 
		List<Student> students = this.jdbcTemplate.query(query,rowMapper);
		return students;
	}
	
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query, studentId);
		return result;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
