<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"  %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" 
	 driver="com.mysql.cj.jdbc.Driver" 
	 url = "jdbc:mysql://localhost:3306/jstldemo" 
	 user="root" 
	 password="2802" />

<sql:query var="rs" dataSource="${db}">select * from person</sql:query>

</body>
</html>z