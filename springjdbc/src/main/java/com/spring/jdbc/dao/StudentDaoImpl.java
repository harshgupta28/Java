package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		// inserting query
		String query = "insert into student(id,name,city) values(?,?,?)";

		// fire the query
		int r = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public int update(Student student) {

		// update query
		String query = "delete student set name=? , city=?  where id=? ";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	public int delete(int studentId) {

		// deleting query
		String query = "delete from student where id=?;";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public Student getStudent(int studentId) {

		// select single student data
		String query = "select * from student where id=? ";
		RowMapper<Student> rowMapper = new RowMapperImpl(); // can also use anonymous class
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	public List<Student> getAllStudents() {

		// select multiple students
		String query = "select * from student ";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

}
