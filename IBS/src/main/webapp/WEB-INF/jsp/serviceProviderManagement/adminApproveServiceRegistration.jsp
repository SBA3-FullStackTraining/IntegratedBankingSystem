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
<!-- <link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerResetPassword.css" /> -->
<title>View Service Provider Details</title>
<style>
#customerInfo{
font-family:CALIBRI;
border-collapse:collapse;
width:100%;
}

#customerInfo td,tr,th{
border : 1px solid;
font-family:CALIBRI;
}

#customerInfo th{
background:#8d82e6;
color:#000;
}
</style>
<script>
function selectID(number) {
    document.getElementById("btnApprove").href = "../admin/approveKYC/"+number;
    document.getElementById("btnReject").href = "../admin/rejectKYC/"+number;
}
</script>
</head>
<body >

	<h1 id="welcomeText" align="center">Customer details</h1>
	<table id="customerInfo">
			<thead>
				<tr>
					
					<th>SPI_ID</th>
					<th>Service Provider Utility</th>
					<th>Provider Details</th>
					<th>Service Provider Bank</th>
					<th>Service Provider Account No</th>
					<th>KYC Status</th>
					<th>Proof(PAN)</th>
					<th>Approve/Decline</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${serviceDto}" var="service">
					<tr>
						<td><c:out value="${service.spi}" /></td>
						<td><c:out value="${service.spiUtility}" /></td>
						<td><c:out value="${service.providerDetails}" /></td>
						<td><c:out value="${service.spBankName}" /></td>
						<td><c:out value="${service.spAccNo}" /></td>
						<td><c:out value="${service.spKYCStatus}" /></td>
						<td><c:out value="${service.givenID}" /></td>
						<td colspan="2">
							<a href="../admin/approveSPKYC/${service.spi}"><input type="button" value="Approve" id="btnAppr"/></a>
							<a href="../admin/declineSPKYC/${service.spi}"><input type="button" value="Decline" id="btnDecline"/></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
		
	<br> 
	<a href="../admin/adminHome">
		<input type="button" value="Back" id="btnBack"/>
	</a>
	<jsp:include page="../footer.jsp"/>
</body>
</html>