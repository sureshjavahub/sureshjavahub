<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.practice.model.Beans.Employee"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Edit Employee</h1>
		<form:form action="Update_Employee" method="POST" modelAttribute="employee">
			<form:input type="hidden" path="id" />
			<div class="form-floating mb-3">
				<form:input path="name" class="form-control" id="floatingName"
					placeholder="Name" />
				<label for="floatingName">Name</label>
				<form:errors path="name" cssClass="error" />
			</div>
			<div class="form-floating">
				<form:input path="address" class="form-control" id="floatingAddress"
					placeholder="Address" />
				<label for="floatingAddress">Address</label>
				<form:errors path="address" cssClass="error" />
			</div>
			<div class="form-floating">
				<form:input path="sal" class="form-control" id="floatingSalary"
					placeholder="Salary" />
				<label for="floatingSalary">Salary</label>
				<form:errors path="sal" cssClass="error" />
			</div>
			<br />
			<div class="form-floating">
				<input class="btn btn-success" type="submit" value="Update Employee" />
				<a class="btn btn-danger" href="Get_Employees">Cancel</a>
			</div>
		</form:form>
	</div>
</body>
</html>