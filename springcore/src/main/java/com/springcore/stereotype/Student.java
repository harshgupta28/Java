package com.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	//@Component("obj") this can be used for specified object name 
			// second way of declaring bean (without xml file)
public class Student {
	
	@Value("harsh")
	private String studentName;
	@Value("kanpur")
	private String City;
	@Value("#{phoneslist}") //expression language
	public List<String> phones;
	
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", City=" + City + "]";
	}
}
