package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/add")	//servlet annotation //no need of xml 
public class AddServlet extends HttpServlet
{
	// we can use doPost method instead of service to ensure that we only work with post method
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{

		int i= Integer.parseInt(request.getParameter("num1"));
		int j= Integer.parseInt(request.getParameter("num2"));
		
		int k=i+j;
		
//		System.out.println("result is "+k); // printed on console
//		PrintWriter writer = res.getWriter(); // getting object from server to client side
//		writer.println("result is "+k);
		
//		we can also call another servlet through
//		1 -  Request Dispatcher 
			request.setAttribute("k", k);
			RequestDispatcher rd = request.getRequestDispatcher("/sq");
			rd.forward(request, response);
		
//		//session management
//			HttpSession session = request.getSession();
//			session.setAttribute("k", k);
//			response.sendRedirect("sq"); 
		
//		2 - sendRedirect	
//			res.sendRedirect("sq?k="+k); 	//session management - URL rewriting (transferring data)
		
		//cookies
//			Cookie cookie = new Cookie("k", k+"");
//			response.addCookie(cookie);
//			response.sendRedirect("sq");
		
	}
}
