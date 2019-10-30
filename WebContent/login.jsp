<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
.labels {
	display: inline-block;
	width: 140px;
	margin-bottom: 10px;
}
</style>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<form action="login" method="post">

		<label class="labels" for="email">Login or Email:</label><input	name="login"> 
		<br>
		<label class="labels" for="password">Password:</label><input name="password"> 
		<br> 
		<input type="submit" name="Login">

	</form>

	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>