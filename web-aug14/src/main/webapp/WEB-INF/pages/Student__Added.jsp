<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.lang.Number.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Integer k=(Integer)request.getAttribute("k");
     if(k==1)
     {
    	 out.println("sucess");
     }
     else
     {
    	 out.println("not added");
     }
     
     %>
</body>
</html>