<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Employee</h2>
<form:form method="post" modelAttribute="employee" action="SaveEmployee">

<table>
<tr>
<td>name
</td>
<td><form:input path="name" /></td>
<td><form:errors path="name"/></td>
</tr>

<tr>
<td>address</td>
<td><form:input path="address"/></td>
<td><form:errors path="address"/></td>
</tr>

<tr>
<td>sal</td>
<td><form:input path="sal"/></td>
<td><form:errors path="sal"/></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="save"></td>

</tr>
</table>
</form:form>
</body>
</html>