<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="page2" method="get"> 
	
		<label>Product ID:</label>
		<input type="text" name="pid" ><br> 
		<label>Product Name:</label> 
		<input type="text" name="pname"><br> 
		<label>Product Price:</label>
		<input type="text" name="price"><br>
		<button type="submit">Submit</button>
	</form>
<h2>${BlankPage }</h2>
 
</body>
</html>