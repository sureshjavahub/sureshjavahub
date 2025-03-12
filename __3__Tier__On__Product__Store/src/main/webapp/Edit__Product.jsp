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
Product__Bean pb=(Product__Bean)request.getAttribute("pb");
Admin__Bean ab= (Admin__Bean)session.getAttribute("adminBean");
out.println(ab.getF_name()+" is Edting The Product");
%>


<form action="Product__Update__Servlet" method="post">
<input type="hidden" name="code" value="<%=pb.getCode()%>">
<br>
<input type="text" name="name" value="<%=pb.getName()%>">
<br>
<input type="number" name="price" value="<%=pb.getPrice()%>">
<br>
<input type="number" name="QTY" value="<%=pb.getQTY()%>">
<br>
<input type="submit" value="Update">



</form>
</body>
</html>