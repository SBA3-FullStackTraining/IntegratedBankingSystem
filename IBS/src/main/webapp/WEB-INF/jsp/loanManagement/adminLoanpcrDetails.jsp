<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply for Loan</title>
<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/custapplyforloan.css" />
		<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/background.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		
		<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
</head>
<body>
<jsp:include page="../header.jsp"/>
<h1 style="text-align:center">Loan Details</H1>
<spring:form action="${pageContext.request.contextPath}/admin/adminLoanpcrconfirm" modelAttribute="LoanOutputDTO">

		<center>
			<table id="table">
				<tr>
					<center><th colspan="2" ><h2>Loan Details</h2></th></center>
					<br>
				</tr>
				<tr>
					<th><spring:label path = "customerId">Customer ID</spring:label></th>
					<td><spring:input path = "customerId" type ="text" value="${LoanOutputDTO.customerId}" readonly="true" /></td>
				</tr>
				<tr>
					<th><spring:label path = "loanId">Loan ID</spring:label></th>
					<td><spring:input path = "loanId" type ="text" value="${LoanOutputDTO.loanId}" readonly="true" /></td>
				</tr>
				<tr>
					<th><spring:label path = "loanName">Loan Name</spring:label></th>
					<td><spring:input path = "loanName" type ="text" value="${LoanOutputDTO.loanName}" readonly="true" /></td>
				</tr>
				<tr>
					<th><spring:label path = "loanAmount">Loan Amount</spring:label></th>
					<td><spring:input path = "loanAmount" type ="text" value="${LoanOutputDTO.loanAmount}" readonly="true" /></td>
				</tr>
                <tr>
					<th><spring:label path = "loanApplicationDate">Loan Application Date</spring:label></th>
					<td><spring:input path = "loanApplicationDate" type ="text" value="${LoanOutputDTO.loanApplicationDate}" readonly="true" /></td>
				</tr>
                <tr>
					<th><spring:label path = "businessStructure">Business Structure</spring:label></th>
					<td><spring:input path = "businessStructure" type ="text" value="${LoanOutputDTO.businessStructure}" readonly="true" /></td>
				</tr>
				 <tr>
					<th><spring:label path = "billingIndicator">Billing Indicator</spring:label></th>
					<td><spring:input path = "billingIndicator" type ="text" value="${LoanOutputDTO.billingIndicator}" readonly="true" /></td>
				</tr>
				 <tr>
					<th><spring:label path = "taxIndicator">Tax Indicator</spring:label></th>
					<td><spring:input path = "taxIndicator" type ="text" value="${LoanOutputDTO.taxIndicator}" readonly="true" /></td>
				</tr>
				<tr>
					<th><spring:label path = "loanTenure">Loan Tenure</spring:label></th>
					<td><spring:input path = "loanTenure" type ="text" value="${LoanOutputDTO.loanTenure}" readonly="true" /></td>
				</tr>
				 <tr>
					<th><spring:label path = "loanInterestRate">Interest Rate</spring:label></th>
					<td><spring:input path = "loanInterestRate" type ="text" value="${LoanOutputDTO.loanInterestRate}" readonly="true" /></td>
				</tr>
				<tr>
					<th><spring:label path = "status">Approve/Decline Loan Pre-Closure</spring:label></th>
					<td>Approved <spring:radiobutton path = "status" value="Closed" /></td>
					<td>Declined <spring:radiobutton path = "status" value="Approved" /></td>
				</tr>

				<tr>
					<th><spring:label path = "remark">Remark</spring:label></th>
					<td><spring:textarea path = "remark" /></td>
				</tr>
				</table>
         
           
             <input name="Submit" type="submit" value="Update Loan PCR Request" />
</spring:form>


<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		
		
<jsp:include page="../footer.jsp"/>
</body>
</html>