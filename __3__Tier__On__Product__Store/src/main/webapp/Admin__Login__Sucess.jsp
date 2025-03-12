<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="july__25__07__2024.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Admin__Bean ab=(Admin__Bean)session.getAttribute("adminBean");
out.println("Welcome "+ab.getF_name());

%>
<a href="Add__Product.html">Add Product</a>
<a href="ViewProducts">View Products</a>
<a href="Admin__Logout">Logout</a>
</body>
</html>