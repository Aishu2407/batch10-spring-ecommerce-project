<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String expMsg = (String) request.getAttribute("expMsg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>

	<table border="1" style="width: 100%; text-align: center;">
	
		<tr>
		
			<td ><a href="./add">Add Item </a></td>
				
				
			<td ><a href="./remove">Remove Item</a></td>
				
				
			<td ><a href="./search">Search Item</a></td>
				
				
			<td ><a href="./searchAll"	>See All</a></td>
			
				
			<td ><a href="./update">Update Item</a></td>
				
				
			<td ><a href="./logout">Logout</a></td>
				
		</tr>

	</table>

	<%
		if (expMsg != null && !expMsg.isEmpty()) {
	%>
	<h1 style="color: blue;">
		<%=expMsg%></h1>
	<%
		}
	%>
</body>
</html>