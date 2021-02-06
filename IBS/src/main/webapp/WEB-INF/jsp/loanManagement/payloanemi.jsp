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
<h1 style="text-align:center">Fetch Loan EMI Details</H1>
<%-- <spring:form action="${pageContext.request.contextPath}/user/LoanEmiDetails" modelAttribute="LoanOutputDTO"> --%>

<H2 style="text-align:center">EMI Amount</H2>
<table id="emi_amt" style="background: cornsilk;">
			<thead>
				<tr>
					<th>Customer_ID</th>
					<th>Loan_Id</th>
					<th>Loan_Name</th>
					<th>EMI_Amount</th>
					<th colspan="1">Click Here to Pay</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${LoanOutputDTO}" var="id">
					<tr>
						<td><c:out value="${id.customerId}" /></td>
						<td><c:out value="${id.loanId}" /></td>
						<td><c:out value="${id.loanName}" /></td>
						<td><c:out value="${id.emi}" /></td>
						
						<td colspan="1">
							<a href="../user/LoanEmiDetails/${id.loanId}/${id.emi}/${id.customerId}"><input type="button" value="Pay Emi" id="pay_emi"/></a>
							
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			<br> 
	<a href="../user/userHome">
		<input type="button" value="Back" id="btnBack"/>
</body>
</html>