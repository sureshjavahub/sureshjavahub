<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Student Name: </b><%= request.getAttribute("name") %><br>
<b>Date: </b><%= request.getAttribute("date") %>
<h1>Hello World....</h1>
</body>
</html>