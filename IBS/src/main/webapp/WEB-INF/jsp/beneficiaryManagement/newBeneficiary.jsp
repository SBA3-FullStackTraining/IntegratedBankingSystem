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
<title>Beneficiary Status page</title>
</head>
<body >
	<h1 id="welcomeText" align="center">Beneficiary Details</h1>
	<div align="center">
	<h3>Beneficiary Details updated Successfully !!</h3>
	</div>
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
				<tr>
					<td><c:out value="${updatedBenf.beneficiaryID}" /></td>
					<td><c:out value="${updatedBenf.customerID}" /></td>
					<td><c:out value="${updatedBenf.benfAccHolderName}" /></td>
					<td><c:out value="${updatedBenf.benfRelation}" /></td>
					<td><c:out value="${updatedBenf.benfBankName}" /></td>
					<td><c:out value="${updatedBenf.benfBankAccountType}" /></td>
					<td><c:out value="${updatedBenf.benfBankAccID}" /></td>
					<td><c:out value="${updatedBenf.benfBankIFSC}" /></td>
				</tr>
			</tbody>
		</table>
	<br> 
	<a href="../user/userHome">
		<input type="button" value="Home" id="btnBack"/>
	</a>
</body>
</html>