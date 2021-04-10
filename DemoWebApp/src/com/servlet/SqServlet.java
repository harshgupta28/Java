package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/sq")	//servlet annotation //no need of xml 
public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int k=0;
//		//session management
//			HttpSession session = request.getSession();
//			int k = (int) session.getAttribute("k");
		
//		cookies
//			Cookie cookies[] = request.getCookies();
//			for(Cookie c:cookies)
//			{
//				if(c.getName().equals("k"))
//					k = Integer.parseInt(c.getValue());
//			}
		
//		request dispatcher
			k = (int) request.getAttribute("k"); // getting attribute of request dispatcher
		
		k = k*k;
		
		PrintWriter writer = response.getWriter(); 
		
		writer.println("resultant square is "+ k);
		
		RequestDispatcher rd = request.getRequestDispatcher("/my");
		rd.forward(request, response);
		
	}
	
}
