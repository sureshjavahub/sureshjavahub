<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.practice.model.Beans.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Student student=(Student)request.getAttribute("student"); %>
<form action="Update_Student">

<table border="1">
<tr><td><input type="hidden" name="id" value="<%=student.getId()%>"></td></tr>
<tr><td>Enter name: <input type="text" name="name" value="<%=student.getName()%>"></td></tr>
<tr><td>Enter Fee: <input type="number" name="fee" value="<%=student.getFee()%>"></td></tr>
<tr><td  align="center"><input type="submit" value="Update"><a href="get_All_Students">cancle</a></td></tr>
</table>
</form>

</body>
</html>