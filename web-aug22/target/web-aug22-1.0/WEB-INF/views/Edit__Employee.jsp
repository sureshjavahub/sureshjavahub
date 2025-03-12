<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.practice.model.Beans.Employee"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Employee emp=(Employee)request.getAttribute("emp");
%>
<form action="SaveEmployee">
<table>
<tr><td>id</td><td><input value="<%=emp.getId()%>" readonly="readonly"></td></tr>

<tr>
<td>name
</td>
<td><input value="<%=emp.getName()%>"/></td>
</tr>

<tr>
<td>address</td>
<td><input value="<%=emp.getAddress()%>"/></td>
</tr>

<tr>
<td>sal</td>
<td><input value="<%=emp.getSal()%>"/></td>
</tr>

<tr >
<td colspan="2" align="center"><input type="submit" value="save"></td>

</tr>
</table>
</form>
</body>
</html>