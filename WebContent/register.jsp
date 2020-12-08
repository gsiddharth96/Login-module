<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginRegister" method="post">
	<center>
		<table>
			<tr>
				<td><h3>Registration Page</h3></td>
			</tr>
			<tr>
				<td>USERNAME :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>PASSWORD :</td>
				<td><input type="password" name="password1"></td>
			</tr>
			<tr>
				<td>Re-Enter PASSWORD :</td>
				<td><input type="password" name="password2"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="register"></td>
			</tr>
		</table>
	</center>	
	</form>
</body>
</html>