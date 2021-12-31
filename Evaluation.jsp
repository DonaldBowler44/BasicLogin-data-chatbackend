<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Evaluation</title>
</head>
<body>
<h1>Guru Medical Evaluation</h1>
<form action="med_reg" method="post">
			<table style="with: 50%">
				<tr>
					<td>Symptoms</td>
					<td><input type="text" name="Symptoms" /></td>
				</tr>
				<tr>
					<td>Time of incident</td>
					<td><input type="text" name="Time_of_incident" /></td>
				</tr>
				<tr>
					<td>Medication</td>
					<td><input type="text" name="Medication" /></td>
				</tr>
					<tr>
					<td>Insurance</td>
					<td><input type="password" name="Insurance" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="Address" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="Contact" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>