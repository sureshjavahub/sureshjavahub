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

//Scriptlet tag
String id= request.getParameter("id");
String name=request.getParameter("name");
String desg=request.getParameter("desg");
Float salary=Float.valueOf(request.getParameter("sal"));
String mail =request.getParameter("mail");
Long phone=Long.valueOf(request.getParameter("phone"));
out.println("=========Empoyee Details==========");
out.println("<br>Employee Id: "+id);
out.println("<br>Employee Name: "+name);
out.println("<br>Employee Designation: "+desg);
out.println("<br>Employee Salary: "+salary);
out.println("<br>Employee Mail Id: "+mail);
out.println("<br>Employee Phone No: "+phone);

%>
</body>
</html>