<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.error {
	color: #ff0000;
}
 
.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<title>Cab Management System</title>
</head>
<body style="text-align: center; border-width: 1px;">
<h1>Cab Management System</h1>
<br/><br/><br/><br/><br/>
	<table >
		<tr>
			<td>
				<form:form action="login.htm" modelAttribute="subscriber" method="POST">				
				<table border="1px">
					<tr> 
						<td><label for="usernameInput">User Name : </label></td>
						<td><form:input path="username" id="usernameInput" /></td>
						<td><form:errors path="username" cssClass="error" /></td>
					</tr>
					
					<tr>
						<td><label for="passwordInput">Password : </label></td>
						<td><form:input path="password" id="passwordInput" /></td>
						<td><form:errors path="password" cssClass="error"  /></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Login"/>
						</td>
					</tr>
				</table>
				</form:form>
			</td>
			<td>
				<form method="post" action="register.htm">
					<table border="1px">
						<tr><td>Not a member yet... then register.</td></tr>
						<tr><td><input type="submit" value="Register" id="register" /></td></tr>
					</table>
				</form>			
			</td>
		</tr>
	</table>

</body>
</html>