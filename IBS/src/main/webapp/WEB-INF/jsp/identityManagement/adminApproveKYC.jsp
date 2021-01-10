<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/tableInfo.css" />
<title>View Approved Customer details</title>
</head>
<body >
	<h1 id="welcomeText" align="center">KYC Approved Customer details</h1>
	<br/>
	<div align="center">
	<h3>KYC Approval Successful</h3>
	</div>
	<table id="customerInfo" style="background: cornsilk;">
			<thead>
				<tr>
					<th>Customer_ID</th>
					<th>First_Name</th>
					<th>Last_Name</th>
					<th>Phone_Number</th>
					<th>Email</th>
					<th>Date_Of_Birth</th>
					<th>City</th>
					<th>State</th>
					<th>Country</th>
					<th>Pincode</th>
					<th>Full_Address</th>
					<th>Given_ID</th>
					<th>ID_Number</th>
					<th>KYC_Status</th>
				</tr>
			</thead>
			<tbody>
					<tr>
						<td><c:out value="${updatedCust.customerID}" /></td>
						<td><c:out value="${updatedCust.firstName}" /></td>
						<td><c:out value="${updatedCust.lastName}" /></td>
						<td><c:out value="${updatedCust.phoneNumber}" /></td>
						<td><c:out value="${updatedCust.email}" /></td>
						<td><c:out value="${updatedCust.dateOfBirth}" /></td>
						<td><c:out value="${updatedCust.city}" /></td>
						<td><c:out value="${updatedCust.state}" /></td>
						<td><c:out value="${updatedCust.country}" /></td>
						<td><c:out value="${updatedCust.pincode}" /></td>
						<td><c:out value="${updatedCust.fullAddress}" /></td>
						<td><c:out value="${updatedCust.givenID}" /></td>
						<td><c:out value="${updatedCust.IDNumber}" /></td>
						<td><c:out value="${updatedCust.kycStatus}" /></td>
					</tr>
			</tbody>
		</table>
	<br> 
	<a href="../../admin/adminHome">
		<input type="button" value="Home" id="btnBack"/>
	</a>
</body>
</html>