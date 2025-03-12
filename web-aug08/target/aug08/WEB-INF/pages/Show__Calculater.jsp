<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Calculater" >
<table border="2">
<tr>
<td>NO_1</td>
<td><input type="number" name="value_1"></td>
</tr>

<tr><td>NO_2</td> <td><input type="number" name="value_2"></td></tr>

<tr><td>SElECT OPERATION</td>
<td><select name="option">
<option value="+">Add</option>
<option value="-">Subtraction</option>
<option value="*">Multiplication</option>
<option value="/">Division</option>
</select></td></tr>

<tr><td colspan="2" align="center"><input type="submit" ></td></tr>
</table>
</form>
</body>
</html>