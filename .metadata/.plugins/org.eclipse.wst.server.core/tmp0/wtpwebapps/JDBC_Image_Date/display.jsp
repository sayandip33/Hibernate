<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.Base64" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Data</title>
</head>
<body>
	<h1>Data Table</h1>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Date</th>
			<th>Image</th>
		</tr>
		<%
		
		ResultSet rs=(ResultSet)request.getAttribute("rs");
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getString("phoneNo")%></td>
			<td><%=rs.getString("date")%></td>
			<td><img src="data:image/jpeg;base64,<%=Base64.getEncoder().encodeToString(rs.getBytes("image"))%>" width="100" height="100" /></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>