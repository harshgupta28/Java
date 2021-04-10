package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao
{
	private HibernateTemplate hibernateTemplate;//through this object DAO can insert,save,update in database
	
	//save student
	@Transactional // so that we can perform write operation
	public int insert(Student student)
	{
		//insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	// get the single object
	public Student getStudent(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	// get all objects(all rows
	public List<Student> getAll()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	// delete a row
	@Transactional
	public void deleteStudent(int studentId)
	{
		this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(studentId);
	}
	
	//updating data
	@Transactional
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}