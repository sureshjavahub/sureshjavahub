<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="july__19_$_20__2024.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PersonBean pb=(PersonBean)application.getAttribute("personBean");
out.println(pb.getL_name()+"Editing The Page");
%>
<form action="EditServlet" method="post">
First_Name: <input type="text" name="F_name" value="<%=pb.getF_name()%>">
Last_Name: <input type="text" name="L_name" value="<%=pb.getL_name()%>">
Adress: <input type="text" name="address" value="<%=pb.getAddress()%>">
Mail_ID: <input type="text" name="mail" value="<%=pb.getMail()%>">
Phone: <input type="number" name="phone" value="<%=pb.getPhone()%>">
<input type="submit" value="update">




</form>
</body>
</html>