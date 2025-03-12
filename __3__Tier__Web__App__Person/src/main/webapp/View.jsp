<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="july__19_$_20__2024.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PersonBean pb=(PersonBean)application.getAttribute("personBean");
out.println("Page belongs to "+pb.getF_name()+"<br>");
out.println(pb.getF_name()+"&nbsp&nbsp"+pb.getL_name()+"&nbsp&nbsp"+pb.getAddress()+"&nbsp&nbsp"
+pb.getMail()+"&nbsp&nbdp"+pb.getPhone()+"&nbsp&nbsp"+"<a href='Edit.jsp'>Edit<a>"+"<br>");



%>

<a href="LogoutServlet">Logout</a>
</body>
</html>