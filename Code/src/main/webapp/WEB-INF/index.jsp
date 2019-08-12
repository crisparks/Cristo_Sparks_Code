<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<p>What is the code?</p>
		<p><c:out value="${error}"></c:out></p>
		<form method="POST" action="/code">
    		<label>Password: <input type="password" name="password"></label>
    		<button>Login</button>
		</form>
	</body>
</html>