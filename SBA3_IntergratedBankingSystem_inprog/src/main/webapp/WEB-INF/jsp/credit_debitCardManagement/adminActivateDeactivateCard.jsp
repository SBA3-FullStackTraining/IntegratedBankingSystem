<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Activate/De-Activate card</title>
<link rel="stylesheet" type="text/css" href="../../css/background.css" />
<link rel="stylesheet" type="text/css" href="../../css/adminActvDeactvCardReq.css" />
<script type="text/javascript" src="../../js/viewDetails.js"></script>
</head>
<body>
	<h1 id="welcomeText" align="center">Activate/De-Activate card request</h1>
	<br />
	<br />

	<div align="center">
		<h3>Pending Requests</h3>
		<form method="POST" action="adminActvDeactvCardReq">
			<a onclick="toggleButton(event, 'Request 1 by the customer')"><label>Request 1 by the customer</label></a>
			<div id="Request 1 by the customer">
				<p>details of the request 1 will be here</p>
				<input type="submit" value="Approve" name="approve"/>
				<input type="submit" value="Decline" name="decline"/>
			</div>
		</form>
		<br>
		<form method="POST" action="adminActvDeactvCardReq">
			<a onclick="toggleButton(event, 'Request 2 by the customer')"><label>Request 2 by the customer</label></a>
			<div id="Request 2 by the customer">
				<p>details of the request 1 will be here</p>
				<input type="submit" value="Approve" name="approve"/>
				<input type="submit" value="Decline" name="decline"/>
			</div>
		</form>
	</div>
	
	<br>
	<br>
	<div align="center" >
		<a href="customerHome"><input type="button" value="Back" id="btnBack"></a>
	</div>


</body>
</html>