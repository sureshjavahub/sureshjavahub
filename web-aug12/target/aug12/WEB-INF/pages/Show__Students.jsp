<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,com.practice.Beans.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<Student> students =(ArrayList<Student>)request.getAttribute("students");
for( Student s:students)
{
	%><table border="1" ><tr><td><%=s.getId() %></td><td><%=s.getName() %></td><td><%=s.getFee()%></td></tr></table>
<% }
%>
</body>
</html>