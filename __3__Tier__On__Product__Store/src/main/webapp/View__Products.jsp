<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="july__25__07__2024.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Admin__Bean ab=(Admin__Bean)session.getAttribute("adminBean");
out.println("This Page Belongs to:: "+ab.getF_name()+"<br>");
ArrayList<Product__Bean> al=(ArrayList<Product__Bean>)session.getAttribute("al");

if(al.size()==0)
{
	out.println("List is Empty....");
}

else
{
	Iterator<Product__Bean> itr=al.iterator();
	while(itr.hasNext())
	{
		Product__Bean pb=itr.next();
		
		out.println(pb.getCode()+"&nbsp&nbsp"+pb.getName()+"&nbsp&nbsp"+pb.getPrice()+"&nbsp&nbsp"+pb.getQTY()+"&nbsp&nbsp"+"<a href='Edit?P_code="+pb.getCode()+"'>Edit</a>"+"&nbsp&nbsp"+"<a href='Delete__Servlet?"+pb.getCode()+"'>Delete</a>)"+"<br>");
	}
}


%>

<a href="Add__Product.html">Add Product</a>
<a href="Logout">Logout</a>
</body>

</html>