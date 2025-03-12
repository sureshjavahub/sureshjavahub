<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<String> names=(List<String>)request.getAttribute("names");
   for(String name:names)
   {%><%=name%><br>
   <% }%>

</body>
</html>