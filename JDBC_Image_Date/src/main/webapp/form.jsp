<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Data Form</title>
</head>
<body>
    <form action="SaveDataServlet" method="post"enctype="multipart/form-data">
        Name: <input type="text" name="name"><br>
        Email: <input type="email" name="email"><br>
        Phone Number: <input type="text" name="phoneNo"><br>
        Date: <input type="date" name="date"><br>
        <input type="file" name="file"><br>
        <input type="submit" value="Submit">
    </form>
    <%
    if(request.getAttribute("msg")!=null) {
    	out.println(request.getAttribute("msg"));
    }
    
    %>
</body>
</html>
