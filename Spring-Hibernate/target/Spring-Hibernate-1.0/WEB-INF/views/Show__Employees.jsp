<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.*,com.practice.model.Beans.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function delete_Employee(id)
{
	if(confirm("do you want to delete employee"))
		{
	document.frm.id.value=id;
	document.frm.action="Delete_Employee";
	document.frm.submit();
		}
	
}

function edit_Employee(id)
{
	document.frm.id.value=id;
	document.frm.action="EditEmployee";
	document.frm.submit();
	}
</script>
<body>

<%List<Employee> employees = (List<Employee>)request.getAttribute("employees"); %>
<form name="frm">
<input type="hidden" name="id">
<table border="1">
<% 
for(Employee e: employees )
{%>
	<tr><td><%=e.getId() %></td>
	<td><%=e.getName()%></td>
	<td><%=e.getAddress() %></td>
	<td><%=e.getSal() %></td>
	<td><input type="button" value="delete" onclick="delete_Employee('<%=e.getId()%>')"></td>
	<td><input type="button" value="edit" onclick="edit_Employee('<%=e.getId()%>')"></td>
	</tr>
	<% 
}%>
	
</table>
</form>
<a href="Enter_Employee">add Employee</a>
</body>
</html>