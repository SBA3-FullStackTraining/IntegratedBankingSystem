<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Update Loan</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/withdraw_admin.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action="UpdateLoan">
		<h1 align="center" class="a">Update Loan Details</h1>
		<br><br>
			<table>
				<tr>
					<th colspan="2" class="b">Update Loan Interest</th>
				</tr>
				<tr>
					<th><spring:label path = "loanId" >Loan Account No</spring:label></th>
					<td><spring:input path = "loanId" type ="text" /></td>
				</tr>
				    <spring:input path="FetchLoan" type="submit" value="Fetch Loan"/>
				<tr>
					<th><spring:label path = "loanName" >Loan Name  </spring:label></th>
					<td><spring:input path = "loanName" type ="text" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "loanAmount" >Loan Amount  </spring:label></th>
					<td><spring:input path = "loanAmount" type ="text" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "loanApplicationDate" >Loan Application Date  </spring:label></th>
					<td><spring:input path = "loanApplicationDate" type ="text" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "businessStructure" >Business Structure  </spring:label></th>
					<td><spring:input path = "businessStructure" type ="text" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "billingIndicator" >Billing Indicator  </spring:label></th>
					<td><spring:input path = "billingIndicator" type ="text" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "taxIndicator" >Tax Indicator  </spring:label></th>
					<td><spring:input path = "taxIndicator" type ="text" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "loanTenure" >Loan Tenure  </spring:label></th>
					<td><spring:input path = "loanTenure" type ="text" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "remark" >Remark  </spring:label></th>
					<td><spring:textarea path = "remark" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "status" >Status  </spring:label></th>
					<td><spring:textarea path = "status" readonly/></td>
				</tr>
				<tr>
					<th><spring:label path = "LoanintrestRate" >Set Interest Rate  </spring:label></th>
					<td><spring:textarea path = "LoanintrestRate" type="text"/></td>
				</tr>
				<tr>
					<th><spring:label path = "Approve" name="Approveor">Approve Loan</spring:label></th>
					<td><spring:input path = "Approve" type="radio" name="ApproveorDecline" value=1></spring:input></td>
					<th><spring:label path = "Decline" name="Decline">Decline Loan</spring:label></th>
					<td><spring:input path = "Decline" type="radio" name="ApproveorDecline" value=-1></spring:input></td>
				</tr>
				
				</table>
				<spring:input path="update" type="submit" value="Update"></spring:input>
				</spring:form>
				</body>
				</html>
				
				