<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>This is help page </h1>
	<%
		String name = (String)request.getAttribute("name");
	%>
	<h1>my name is <%=name%></h1>
	
	<!-- using jsp expression language -->
	
	<h1>my nickname name is </h1>
	<h1>${nickname}</h1>
	<hr>

	<c:forEach var="item" items="${ct }">	<!-- jstl used-->
		<h3>${item }</h3>
		<%-- <c:out value="item"></c:out>  can also be printed in this way--%> 
	</c:forEach>
	
	
</body>
</html>