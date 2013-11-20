<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cab Management System</title>
<script language="javascript">
function formSubmit()
{
	alert("hi");
	alert(document.getElementById("command"));
	document.getElementById("command").submit();
	
}
</script>
</head>
<body style="text-align: center; border-width: 1px;">


<h1>Cab Management System</h1>
<br/><br/><br/><br/><br/>

	<table>
		<tr>
			<td>
				<form method="post" action="login.htm">
				<table border="1px">
					<tr>
						<td>UserName:</td>
						<td><input type="text" id="usesrname" value=""/></td>
					</tr>
					
					<tr>
						<td>Password:</td>
						<td><input type="password" id="password" value=""/></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Login"/>
						</td>
					</tr>
				</table>
				</form>
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