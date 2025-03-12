<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*,com.practice.model.Beans.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<script type="text/javascript">
	function delete_Employee(id) {
		if (confirm("do you want to delete employee")) {
			document.frm.id.value = id;
			document.frm.action = "Delete_Employee";
			document.frm.submit();
		}

	}

	function edit_Employee(id) {
		document.frm.id.value = id;
		document.frm.action = "EditEmployee";
		document.frm.submit();
	}
</script>
<body>
	<div>

		<form name="frm">
			<input type="hidden" name="id">
			<table class="table table-striped-columns">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Address</th>
					<th>Salary</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>

				<%
				List<Employee> employees = (List<Employee>) request.getAttribute("employees");
				if (employees.isEmpty()) {
				%>
				<tr>
					<td colspan="4">No Employees found!!</td>
				</tr>

				<%
				}
				for (Employee e : employees) {
				%>
				<tr>
					<td><%=e.getId()%></td>
					<td><%=e.getName()%></td>
					<td><%=e.getAddress()%></td>
					<td><%=e.getSal()%></td>
					<td><input type="button" value="delete"
						onclick="delete_Employee('<%=e.getId()%>')"></td>
					<td><input type="button" value="edit"
						onclick="edit_Employee('<%=e.getId()%>')"></td>
				</tr>
				<%
				}
				%>

			</table>
		</form>
		<a class="btn btn-info" href="Enter_Employee">add Employee</a>
	</div>
</body>
</html>