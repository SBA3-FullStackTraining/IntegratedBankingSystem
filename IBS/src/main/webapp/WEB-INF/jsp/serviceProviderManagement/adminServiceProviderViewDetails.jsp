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

	<h1 id="welcomeText" align="center">Service Provider details</h1>
	<br/>
	

	<%-- <%
		String username = session.getAttribute("username").toString();
		Customer customerData = (Customer) session.getAttribute("customerInfo");
		
	%> --%>

	<div>
		<table>
			<tbody>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><label>SPI Utility : </label></td>
					<td><label class="info" >${serviceDto.spiUtility}</label></td>
				</tr>
				<tr>
					<td><label>Provider Details : </label></td>
					<td><label class="info" >${serviceDto.providerDetails}</label></td>
				</tr>
				
				<tr>
					<td><label>SP BankName : </label></td>
					<td><label class="info" >${serviceDto.spBankName}</label></td>
				</tr>
				
				<tr>
					<td><label>SP Account Number : </label></td>
					<td><label class="info" >${serviceDto.spAccNo}</label></td>
				</tr>
				<tr>
					<td><label>PAN : </label></td>
					<td><label class="info" >${serviceDto.givenID}</label></td>
				</tr>
				<tr>
					<td><label>Status : </label></td>
					<td><label class="info" >${serviceDto.spKYCStatus}</label></td>
				</tr>
					
			</tbody>
		</table>
	</div>

	
	
	<br> 
	<a href="../admin/adminHome">
		<input type="button" value="Back" id="btnBack"/>
	</a>
	
	
</body>
<jsp:include page="../footer.jsp"/>
</html>