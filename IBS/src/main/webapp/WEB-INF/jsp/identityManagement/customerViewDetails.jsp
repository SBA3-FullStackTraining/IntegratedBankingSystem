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
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerResetPassword.css" />
<script type="text/javascript" src="../static/js/viewDetails.js"></script>
<title>View my Details Page</title>
</head>
<body >
	<h1 id="welcomeText" align="center">Customer details</h1>
	<br/>
	<div class="tab"> 
		<input type="button" class="tablinks" value="Personal" onclick="viewInfo(event, 'Personal')" id="defaultOpen" >
		<input type="button" class="tablinks" value="Account" onclick="viewInfo(event, 'Account')">
	</div>

	<%-- <%
		String username = session.getAttribute("username").toString();
		Customer customerData = (Customer) session.getAttribute("customerInfo");
		
	%> --%>

	<div id="Personal" class="tabcontent">
		<table class="table">
			<tbody>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><label>First Name : </label></td>
					<td><label class="info" >${fetchedCustomer.firstName}</label></td>
				</tr>
				<tr>
					<td><label>Last Name : </label></td>
					<td><label class="info" >${fetchedCustomer.lastName}</label></td>
				</tr>
				<tr>
					<td><label>Phone : </label></td>
					<td><label class="info" >${fetchedCustomer.phoneNumber}</label></td>
				</tr>
				<tr>
					<td><label>Email : </label></td>
					<td><label class="info" >${fetchedCustomer.email}</label></td>
				</tr>
				<tr>
					<td><label>Date of Birth : </label></td>
					<td><label class="info" >${fetchedCustomer.dateOfBirth}</label></td>
				</tr>
				<tr>
					<td><label>City : </label></td>
					<td><label class="info" >${fetchedCustomer.city}</label></td>
				</tr>
				<tr>
					<td><label>State : </label></td>
					<td><label class="info" >${fetchedCustomer.state}</label></td>
				</tr>
				<tr>
					<td><label>Country : </label></td>
					<td><label class="info" >${fetchedCustomer.country}</label></td>
				</tr>
				<tr>
					<td><label>Pincode : </label></td>
					<td><label class="info" >${fetchedCustomer.pincode}</label></td>
				</tr>
				<tr>
					<td><label>Address : </label></td>
					<td><label class="info" >${fetchedCustomer.fullAddress}</label></td>
				</tr>
				<tr>
					<td><label>Select ID : </label></td>
					<td><label class="info" >${fetchedCustomer.givenID}</label></td>
				</tr>
				<tr>
					<td><label>ID number : </label></td>
					<td><label class="info" >${fetchedCustomer.IDNumber}</label></td>
				</tr>
				<tr>
					<td><label>KYC status : </label></td>
					<td><label class="info" >${fetchedCustomer.kycStatus}</label></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
	</div>

	<div id="Account" class="tabcontent">
	<table>
			<tbody>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td ><label>Account ID : </label></td>
					<td><label class="info" >TBD</label></td>
				</tr>
			</tbody>
	</table>
	</div>
	
	<br> 
	<a href="../user/userHome">
		<input type="button" value="Back" id="btnBack"/>
	</a>
	
	<input type="hidden" name="customerID" value="${fetchedCustomer.customerID}" />
	<script>document.getElementById("defaultOpen").click();</script>
</body>
</html>