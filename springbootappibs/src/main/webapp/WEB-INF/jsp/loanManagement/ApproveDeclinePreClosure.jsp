<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Approve Decline Loan Closure</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/withdraw_admin.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action="UpdateLoan">
		<h1 align="center" class="a">Approve/Decline Loan Closure</h1>
		<br><br>
			<table>
				<tr>
					<th colspan="2" class="b">Approve/Decline Loan Closure</th>
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
				
				