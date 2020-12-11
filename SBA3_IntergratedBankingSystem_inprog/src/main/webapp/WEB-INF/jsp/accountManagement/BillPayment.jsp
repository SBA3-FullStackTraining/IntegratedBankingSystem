
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix ="spring"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Bill Payment</title>
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/billPayment.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>
	<body>
		
		<spring:form method="post" action ="BillPayment">
			<h1 align="center" class="a">Bill Payment</h1>
			<br>
			<br>
			<table>
				<tr>
					<th colspan="2" class="b">Service Provider  Details</th>
				</tr>
				<tr>
					<th><spring:label path = "fromAccountNumber">From Account</spring:label></th>
					<td><spring:select path = "fromAccountNumber"><option value="Account No">Choose Your Account</option>
					<option value="Acc No 1"></option>
					</spring:select>
				</tr>
				<tr>
					<th><spring:label path = "spaccountNumber">Service Provider Account No</spring:label></th>
					<td><spring:select path = "spaccountNumber"><option value="Account No">ServiceProvider Acc No</option>
					<option value="Acc No 1"></option>
					<option value="Acc No 2"></option>
					</spring:select>
				</tr>
				<tr>
					<th><spring:label path = "IFSC_Code">IFSC_Code</spring:label></th>
					<td><spring:input path = "IFSC_Code" type ="text" /></td>
					<td><spring:errors path="IFSC_Code"/></td>
				</tr>
				<tr>
					<th><spring:label path = "billamount">Bill Amount</spring:label></th>
					<td><spring:input path = "billamount" type ="text" /></td>
					<td><spring:errors path="billamount"/></td>
				</tr>
				<tr>
					<th><spring:label path = "TransferAmount">Transfer Amount</spring:label></th>
					<td><spring:input path = "TransferAmount" type ="text" /></td>
					<td><spring:errors path="TransferAmount"/></td>
				</tr>
				<tr>
					<th><spring:label path = "transpswd">Transaction Password</spring:label></th>
					<td><spring:input path = "transpswd" type ="password" /></td>
				</tr>
			</table>
			<br>
			<spring:button class="btn btn-danger btn-sm"><b>PAY BILL</b></spring:button>
			</spring:form>
			<h2><a href="SavingsBank">Savings Bank</a></h2>
	</body>
</html>