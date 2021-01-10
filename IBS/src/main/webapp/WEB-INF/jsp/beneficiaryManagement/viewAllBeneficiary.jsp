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
<title>View Beneficiary List Page</title>
</head>
<body >
	<h1 id="welcomeText" align="center">Beneficiary List details</h1>
	<br/>
	<table id="customerInfo" style="background: cornsilk;">
			<thead>
				<tr>
					<th>Beneficiary_ID</th>
					<th>Customer_ID</th>
					<th>Beneficiary_Account_HolderName</th>
					<th>Beneficiary_Relation</th>
					<th>Beneficiary_Bank_Name</th>
					<th>Beneficiary_Bank_AccountType</th>
					<th>Beneficiary_Bank_AccountID</th>
					<th>Beneficiary_BankIFSC</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${beneficiaryList}" var="beneficiary">
					<tr>
						<td><c:out value="${beneficiary.beneficiaryID}" /></td>
						<td><c:out value="${beneficiary.customerID}" /></td>
						<td><c:out value="${beneficiary.benfAccHolderName}" /></td>
						<td><c:out value="${beneficiary.benfRelation}" /></td>
						<td><c:out value="${beneficiary.benfBankName}" /></td>
						<td><c:out value="${beneficiary.benfBankAccountType}" /></td>
						<td><c:out value="${beneficiary.benfBankAccID}" /></td>
						<td><c:out value="${beneficiary.benfBankIFSC}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<br> 
	<a href="../user/userHome">
		<input type="button" value="Back" id="btnBack"/>
	</a>
</body>
</html>