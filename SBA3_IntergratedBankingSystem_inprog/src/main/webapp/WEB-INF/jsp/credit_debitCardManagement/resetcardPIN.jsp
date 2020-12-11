<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/background.css" />
<link rel="stylesheet" type="text/css" href="../../css/customerResetPIN.css" />
<title>Reset Card PIN</title>
</head>
<body>
	<h1 id="welcomeText" align="center">Reset Card PIN</h1>
	<br />
	<br />
	<form class="resetpin" method="POST" action="restPIN">
		<table>
			<tbody>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td align="right"><label>Select Card : </label></td>
					<td>
						<input type="radio" id="credit_card" name="card_type" value="credit_card">
							<label for="credit_card">Credit Card</label>
						<input type="radio" id="debit_card" name="card_type" value="debit_card">
							<label for="debit_card">Debit Card</label>
					</td>
				</tr>
				<tr>
					<td align="right"><label>Select Card Type: </label></td>
					<td>
						<select name="cardType" id="cardType">
							<option value="diamond">Diamond</option>
							<option value="platinum">Platinum</option>
							<option value="gold">Gold</option>
							<option value="silver">Silver</option>
						</select>
					</td>
				</tr>
				<tr>
					<td align="right"><label>Card Number : </label></td>
					<td><input type="text" name="cardNumber" /></td>
				</tr>
				<tr>
					<td align="right"><label>Previous PIN : </label></td>
					<td><input type="password" name="previousPIN" /></td>
				</tr>
				<tr>
					<td align="right"><label>New PIN : </label></td>
					<td><input type="password" name="new_pin" /></td>
				</tr>
				<tr>
					<td align="right"><label>Re-Enter New PIN : </label></td>
					<td><input type="password" name="reEnter_pin" /></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>
			</tbody>
		</table>
		<br>
		<input type="submit" value="Reset" id="reset" />
		<a href="customerHome"><input type="button" value="Cancel" id="btnCancel"></a>
	</form>
		
	
</body>
</html>