<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CMS - Registration Success</title>
</head>
<body>
${message}
<br/>
Please login to access the system.
<br/>
	<form method="post" action="login.htm">
		<table border="1px">
			<tr>
				<td>UserName:</td>
				<td><input type="text" id="usesrname" value=""/></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><input type="text" id="password" value=""/></td>
			</tr>
			<tr>
				<td>
					<input type="submit" id="login" value="Login To CMS"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>