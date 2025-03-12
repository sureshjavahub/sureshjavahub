<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*,com.practice.model.Beans.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function delete_Student(id)
{
	if(confirm("Do you want to delete student ?")){
		document.delete.id.value=id;
	document.delete.action="Delete_Student";
	document.delete.submit();
	
	}
}
function edit_Student(id)
{
	document.delete.id.value=id;
	document.delete.action="Edit_Student";
	document.delete.submit();
	}

</script>
<body>
	<form name="delete">
		<input type="hidden" name="id">
		<%
		ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
		for (Student s : students) {
		%><table border="1" align="center">
			<tr>
				<td><%=s.getId()%></td>
				<td><%=s.getName()%></td>
				<td><%=s.getFee()%></td>
				<td><input type="button" value="delete"
					onclick="delete_Student('<%=s.getId()%>')"></td>
				<td><input type="button" value="edit"
					onclick="edit_Student('<%=s.getId()%>')"></td>
			</tr>
		</table>
		<%
		}
		%>
	</form>
	<a href="enter_Student"> Add Student </a> 
	
	

</body>
</html>