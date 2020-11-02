<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.banking.ibs.dto.Customer"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/background.css" />
<link rel="stylesheet" type="text/css" href="resources/css/viewDetails.css" />
<script type="text/javascript" src="resources/js/viewDetails.js"></script>
<title>View my Details Page</title>
</head>
<body >
	<h1 id="welcomeText" align="center">Customer details</h1>
	<br/>
	<div class="tab"> 
		<input type="button" class="tablinks" value="Personal" onclick="viewInfo(event, 'Personal')" id="defaultOpen" >
		<input type="button" class="tablinks" value="Account" onclick="viewInfo(event, 'Account')">
	</div>

	<%
		String username = session.getAttribute("username").toString();
		Customer customerData = (Customer) session.getAttribute("customerInfo");
		
		session.setAttribute("viewInfo", "true");
		
	%>

	<div id="Personal" class="tabcontent">
		<table>
			<tbody>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><label>First Name : </label></td>
					<td><label class="info" ><%=customerData.getFirstName()%></label></td>
				</tr>
				<tr>
					<td><label>Last Name : </label></td>
					<td><label class="info" ><%=customerData.getLastName()%></label></td>
				</tr>
				<tr>
					<td><label>Phone : </label></td>
					<td><label class="info" ><%=customerData.getPhoneNumber()%></label></td>
				</tr>
				<tr>
					<td><label>Email : </label></td>
					<td><label class="info" ><%=customerData.getEmail()%></label></td>
				</tr>
				<tr>
					<td><label>Date of Birth : </label></td>
					<td><label class="info" ><%=customerData.getDateOfBirth()%></label></td>
				</tr>
				<tr>
					<td><label>City : </label></td>
					<td><label class="info" ><%=customerData.getCity()%></label></td>
				</tr>
				<tr>
					<td><label>State : </label></td>
					<td><label class="info" ><%=customerData.getState()%></label></td>
				</tr>
				<tr>
					<td><label>Country : </label></td>
					<td><label class="info" ><%=customerData.getCountry()%></label></td>
				</tr>
				<tr>
					<td><label>Pincode : </label></td>
					<td><label class="info" ><%=customerData.getPincode()%></label></td>
				</tr>
				<tr>
					<td><label>Address : </label></td>
					<td><label class="info" ><%=customerData.getFullAddress()%></label></td>
				</tr>
				<tr>
					<td><label>Select ID : </label></td>
					<td><label class="info" ><%=customerData.getGivenID()%></label></td>
				</tr>
				<tr>
					<td><label>ID number : </label></td>
					<td><label class="info" ><%=customerData.getIDNumber()%></label></td>
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
					<td ><label>First Name : </label></td>
					<td><label class="info" ></label></td>
				</tr>
			</tbody>
	</table>
	</div>
	
	<br> 
	<form method="POST" action="customerHome">
		<input type="submit" value="Back" id="btnBack"/>
	</form>
	
	<!-- <input type="button" value="back" id="btnBack" onclick="history.back()"/> -->
	
	<script>document.getElementById("defaultOpen").click();</script>
</body>
</html>