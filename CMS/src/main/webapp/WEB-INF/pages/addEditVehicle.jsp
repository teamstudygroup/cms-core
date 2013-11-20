<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CMS-ADD/Edit Vehicle</title>
</head>
<body>
Add/Edit Vehicle Details
${message}



<table>
	<tr>
		<td>VehicleRegNo</td>
		<td><input type="text" id="vehicleRegNoTxt" value=""/></td>
	</tr>
	<tr>
		<td>VIN</td>
		<td><input type="text" id="VINTxt" value=""/></td>
	</tr>
	
	<tr>
		<td>Color</td>
		<td><input type="text" id="colorTxt" value=""/></td>
	</tr>
	<tr>
		<td>Make</td>
		<td><input type="text" id="makeTxt" value=""/></td>
	</tr>
	<tr>
		<td>Model</td>
		<td><input type="text" id="modelTxt" value=""/></td>
	</tr>
	<tr>
		<td>CabNo</td>
		<td><input type="text" id="cabNoTxt" value=""/></td>
	</tr>
	<tr>
		<td>HwyMileage</td>
		<td><input type="text" id="hwyMileageTxt" value=""/></td>
	</tr>
	<tr>
		<td>CityMileage</td>
		<td><input type="text" id="cityMileageTxt" value=""/></td>
	</tr>
	<tr>
		<td>VehicleType</td>
		<td><input type="text" id="vehicleTypeTxt" value=""/></td>
	</tr>
	
	<tr>
		<td colspan="2" align="center"><input type="submit" id="vehicleSubmitBtn" value="Submit"/></td>
	</tr>
</table>

</body>
</html>