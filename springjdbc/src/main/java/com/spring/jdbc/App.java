//demo class
package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Program started.....");
		
		//this uses xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		// this uses annotation context
		//ApplicationContext context = new AnnotationConfigApplicationContext(JDBCconfigJava.class);
		
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		// or below can be used
		// StudentDaoImpl studentDaoImpl =
		// context.getBean("studentDao",StudentDaoImpl.class);

		Student student;
		int rowsaff; // no. of rows affected
		
//		// inserting
//		student = new Student();
//		student.setId(103);
//		student.setName("karvika");
//		student.setCity("renukoot");
//
//		rowsaff = studentDao.insert(student);
//		System.out.println("rows affected : " + rowsaff);
//
//		// updating
//		student = new Student();
//		student.setId(103);
//		student.setName("gautam");
//		student.setCity("allahabad");
//
//		rowsaff = studentDao.update(student);
//		System.out.println("rows affected : " + rowsaff);
//
//		// deleting
//		rowsaff = studentDao.delete(103);
//		System.out.println("rows affected : " + rowsaff);
//		
//		//student specific info
//		student = studentDao.getStudent(102);
//		System.out.println(student);
		
		//all student info
		List<Student>  studentList = studentDao.getAllStudents();
		System.out.println(studentList);
		
		System.out.println("Program ended.....");
	}
};