<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
   
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <%
	String name = request.getAttribute("label").toString();
	out.println(name);
%> --%>
	<c:forEach items="${students}" var="s">
		${s.name}<br>
	</c:forEach>
	<br>
	${students}<br>	<!-- expression language used in jstl -->
	${student.name}<br>
	<c:out value="Hello ${student}" /><br>
<%-- 	<c:import url="https://in.linkedin.com/in/harshgupta28"></c:import>		--%>	

 
</body>
</html>

