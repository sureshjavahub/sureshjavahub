<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.practice.model.Beans.Employee"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Employee emp = (Employee) request.getAttribute("emp");
	%>
	<form action="Update_Employee">
		<table>
			<tr>
				<td>id</td>
				<td><input value="<%=emp.getId()%>" readonly="readonly" name="id"></td>
			</tr>

			<tr>
				<td>name</td>
				<td><input value="<%=emp.getName()%>" name="name"></td>
			</tr>

			<tr>
				<td>address</td>
				<td><input value="<%=emp.getAddress()%>" name="address"></td>
			</tr>

			<tr>
				<td>sal</td>
				<td><input value="<%=emp.getSal()%>" name="sal"></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="save"></td>

			</tr>
		</table>
	</form>
</body>
</html>