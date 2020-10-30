<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1>Welcome to registration page</h1>
	<form class="registerForm" method="post" action="register">
		<table>
			<thead class="theader">
				<tr class="thead1" align="center">
					<td colspan="2">
						<h2>Fill in the details</h2>
					</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td align="right"><label>User name :</label></td>
					<td><input type="text" name="username" id="formElements" /></td>
				</tr>
				<tr>
					<td align="right"><label>Password : </label></td>
					<td><input type="text" name="password" id="formElements" /></td>
				</tr>
				<tr>
					<td align="right"><label>File Name : </label></td>
					<td><input type="text" name="filename" id="formElements" /></td>
				</tr>
				<tr>
					<td align="right"><label>Product Name : </label></td>
					<td><input type="text" name="productname" id="formElements" /></td>
				</tr>
				<tr>
					<td align="right"><label>ZSA Number : </label></td>
					<td><input type="text" name="zsa" id="formElements" /></td>
				</tr>
				<tr>
					<td align="right"><label>Build Number : </label></td>
					<td><input type="text" name="buildno" id="formElements" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>