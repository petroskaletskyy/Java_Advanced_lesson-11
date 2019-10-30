<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlets - Lesson-04</title>
<style type="text/css">
.labels {
	display: inline-block;
	width: 100px;
	margin-bottom: 10px;
}
</style>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<form action="registration" method="post">

	<label class="labels" for="firstName">First name:</label><input name="firstName">
	<br>
	<label class="labels"  for="lastName">Last name:</label><input name="lastName">
	<br>
	<label class="labels"  for="email">Email:</label><input name="email">
	<br>
	<label class="labels"  for="password">Password:</label><input name="password">
	<br>
	<input type="submit" name="Register">

</form>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
