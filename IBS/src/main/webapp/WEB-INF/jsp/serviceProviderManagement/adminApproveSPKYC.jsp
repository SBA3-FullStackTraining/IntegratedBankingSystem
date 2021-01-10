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

	<h1 id="welcomeText" align="center">KYC Approved ServiceProvider details</h1>
	<br/>
	<div align="center">
	<h3>KYC Approval Successful</h3>
	</div>
	<table id="customerInfo" style="background: cornsilk;">
			<thead>
				<tr>
					
					<th>SPI_ID</th>
					<th>Service Provider Utility</th>
					<th>Provider Details</th>
					<th>Service Provider Bank</th>
					<th>Service Provider Account No</th>
					<th>KYC Status</th>
					<th>Proof(PAN)</th>
					
				</tr>
			</thead>
			<tbody>
				
					<tr>
						<td><c:out value="${serviceDto.spi}" /></td>
						<td><c:out value="${serviceDto.spiUtility}" /></td>
						<td><c:out value="${serviceDto.providerDetails}" /></td>
						<td><c:out value="${serviceDto.spBankName}" /></td>
						<td><c:out value="${serviceDto.spAccNo}" /></td>
						<td><c:out value="${serviceDto.spKYCStatus}" /></td>
						<td><c:out value="${serviceDto.givenID}" /></td>
						
					</tr>
				
			</tbody>
		</table>
	<br> 
	<a href="../../admin/adminHome">
		<input type="button" value="Home" id="btnBack"/>
	</a>
</body>
<jsp:include page="../footer.jsp"/>
</html>