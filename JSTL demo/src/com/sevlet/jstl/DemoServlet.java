package com.sevlet.jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		List<Student> listStd = new ArrayList<Student>();
		
		Student s1 = new Student(124,"harsh");
		Student s2 = new Student(116,"gauri");
		Student s3 = new Student(146,"karvika");
		Student s4 = new Student(117,"gautam");
		
		listStd.add(s1);
		listStd.add(s2);
		listStd.add(s3);
		listStd.add(s4);
		
		request.setAttribute("students", listStd);
		request.setAttribute("student", s1);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		
		
	}
}

