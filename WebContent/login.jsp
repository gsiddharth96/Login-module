<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
	<form action="loginRegister" method="post">
	<center>
		<table>
			<tr>
				<td>
					<h3>${massage}</h3>
					<h3>${successMassage}</h3>
					<h3>${logoutMassage}</h3>
				</td>
			</tr>
			<tr>
				<td><h3>USER LOGIN</h3></td>
			</tr>
			<tr>
				<td>USERNAME : </td><td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>PASSWORD : </td><td><input type="password" name="password1"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="login"></td>
				<td><a href="register.jsp">Registration</a></td>
			</tr>
		</table>
	</center>	
	</form>
</body>
</html>