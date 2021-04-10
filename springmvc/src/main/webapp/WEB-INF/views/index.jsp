<!-- view -->
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page </h1>
	<h1>called by home controller</h1>
	<h1>url /Home</h1>
	
	<%
		String name = (String)request.getAttribute("name");
		List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>name is <%=name%></h1>
	
	<%
		for(String s : friends)
		{						/*  scriplet tags*/
	 %>
	   <h2><%=s %></h2>
	 <%
		}
	 %>
	
</body>
</html>