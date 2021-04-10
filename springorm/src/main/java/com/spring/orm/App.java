package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		//write operation
		Student student = new Student(102,"Harshita Shukla","kanpur se he hai");
		
		int r = studentDao.insert(student);
		System.out.println(" done  = "+r);
		
		//read operation
		student = studentDao.getStudent(102);
		System.out.println(student);
		
		//read operation
		List<Student> students = studentDao.getAll();
		System.out.println(students);
		
		studentDao.deleteStudent(102);
		
		//update operation
		student = new Student(102,"Harshita Gupta","kanpur se hi hai");
		studentDao.updateStudent(student);
	}
}
