package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/my")	//servlet annotation //no need of xml 
public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter writer = response.getWriter(); 
		writer.print("hi ");	
		
		//servlet context
//			ServletContext ctx = getServletContext();
//			String str = ctx.getInitParameter("name");
		
		//servlt config
			ServletConfig cfg = getServletConfig();
			String str = cfg.getInitParameter("name");
			
		writer.println("<html><body bgcolor='cyan'>");//html inside java for designing
		writer.println(str);
		writer.println("</body></html>");
		
	}
}
