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
		<input type="text" name="pid" >${error1 }<br> 
		<label>Product Name:</label> 
		<input type="text" name="pname">${error2 }<br> 
		<label>Product Price:</label>
		<input type="text" name="price">${error3 }<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>