<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="july__19_$_20__2024.PersonBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PersonBean pb =(PersonBean)application.getAttribute("personBean");
out.println("Welcome User: "+pb.getF_name()+"<br>");


%>

<a href="ViewServlet">View_Profile</a>
<a href="LogoutServlet">Logout</a>

</body>
</html>