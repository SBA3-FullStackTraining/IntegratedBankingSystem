<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
		<title>Loan Closure Request</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/statementGeneration.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action="LoanPreClosure">
		<h1 align="center" class="a">Loan Pre Closure</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Loan Pre Closure</th>
			</tr>
			<tr>
				<th><spring:label path = "LoanAccountNumber" >Loan Account Number</spring:label></th>
				<td><spring:select path = "LoanAccountNumber"><option value="Account No">Choose Your Account</option>
				<option value="Acc No 1"></option>
				</spring:select>
			</tr>
			<tr>
			   <th><spring:label path = "Reason" >Reason</spring:label>
			   <td><spring:textarea path = "Reason" id="Reason" name="Reason"></spring:textarea></td>
			</tr>
			<tr>
				<th><spring:label path = "Submit_Request"> Submit Request </spring:label></th>
				<td><spring:input path = "Submit_Request" type="submit"/></td>
			</tr>
			</table>
			</spring:form>
			<jsp:include page="footer.jsp"/>
	</body>
</html>