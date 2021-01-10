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
<title>Service Provider Details</title>
<style>
#customerInfo{
font-family:CALIBRI;
border-collapse:collapse;
width:100%;
}

#customerInfo td,tr,th{
border : 1px solid;
font-family:CALIBRI;
color:white;
}

#customerInfo th{
background:#8d82e6;
color:#000;
}
h5{
color: red}
h4{
color: black}
</style>

</head>
<body >
<jsp:include page="../header.jsp"/>
<center>
	<h5>Below are Service Providers Registered with us..<br>Please Pay your Utility Bills to these providers more securely from Bill Payment Tab<br></h5>
	<h4>Savings Bank Management>Pay Utility Bills</h4>
</center>
	
	<table id="customerInfo">
			<thead>
				<tr>
					<th>SPI</th>
					<th>SPI Utility</th>
					<th>Provider Details</th>
					<th>Service Provider Bank</th>
					<th>SP Account No</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${serviceProviderDto}" var="serviceProvider">
					<tr>
						<td><c:out value="${serviceProvider.spi}" /></td>
						<td><c:out value="${serviceProvider.spiUtility}" /></td>
						<td><c:out value="${serviceProvider.providerDetails}" /></td>
						<td><c:out value="${serviceProvider.spBankName}" /></td>
						<td><c:out value="${serviceProvider.spAccNo}" /></td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	<br> 
	
		<center>
			<a href="userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
	<br>
	<br>
		<jsp:include page="../footer.jsp"/>
	</body>
</html>