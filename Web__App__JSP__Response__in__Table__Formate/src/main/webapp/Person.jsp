<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String s[]=request.getParameterValues("hobby");
%>
<table>
<caption> Person Details</caption>
<br>

<tr><th>Name</th><th>Age</th><th>Mobile</th><th>Gender</th><th>Hobbies</th></tr>
<tr><td><%out.println(request.getParameter("name"));%></td><td><%out.println(request.getParameter("age"));%></td><td><%request.getParameter("phone");%>
</td><td><%out.println(request.getParameter("phone"));%></td><td><% out.println(request.getParameter("gender"));%></td><td><%for(String h:s){
	out.println(h);
	
}%></td></tr>

</table>
</body>
</html>