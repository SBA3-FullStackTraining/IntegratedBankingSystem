<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/tableInfo.css" />
<title>View my Details Page</title>
<!-- <script>
function selectID(number) {
    document.getElementById("btnApprove").href = "../admin/approveKYC/"+number;
    document.getElementById("btnReject").href = "../admin/rejectKYC/"+number;
}
</script> -->
</head>
<body >
	<h1 id="welcomeText" align="center">Customer details</h1>
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
					<th colspan="2">Approve/Decline</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list_customers}" var="customer">
					<tr>
						<td><c:out value="${customer.customerID}" /></td>
						<td><c:out value="${customer.firstName}" /></td>
						<td><c:out value="${customer.lastName}" /></td>
						<td><c:out value="${customer.phoneNumber}" /></td>
						<td><c:out value="${customer.email}" /></td>
						<td><c:out value="${customer.dateOfBirth}" /></td>
						<td><c:out value="${customer.city}" /></td>
						<td><c:out value="${customer.state}" /></td>
						<td><c:out value="${customer.country}" /></td>
						<td><c:out value="${customer.pincode}" /></td>
						<td><c:out value="${customer.fullAddress}" /></td>
						<td><c:out value="${customer.givenID}" /></td>
						<td><c:out value="${customer.IDNumber}" /></td>
						<td><c:out value="${customer.kycStatus}" /></td>
						<td colspan="2">
							<a href="../admin/approveKYC/${customer.customerID}"><input type="button" value="Approve" id="btnAppr"/></a>
							<a href="../admin/declineKYC/${customer.customerID}"><input type="button" value="Decline" id="btnDecline"/></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<!-- <a href="../admin/approveKYC"><input type="button" value="Approve" id="btnApprove"/></a>
		<a href="../admin/rejectKYC"><input type="button" value="Reject" id="btnReject"/></a> -->
		
	<br> 
	<a href="../admin/adminHome">
		<input type="button" value="Back" id="btnBack"/>
	</a>
</body>
</html>