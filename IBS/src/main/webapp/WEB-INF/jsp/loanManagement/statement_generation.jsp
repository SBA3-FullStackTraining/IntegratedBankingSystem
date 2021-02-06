<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Statement</title>
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
</head>
<body>
<jsp:include page="../header.jsp"/>
<h1 style="text-align:center">Loan EMI Details</H1>
<table id="emi_amt" style="background: cornsilk;">
			<thead>
				<tr>
				    <th>EMI Transaction ID</th>
					<th>Customer_ID</th>
					<th>Loan_Id</th>
					<th>Month</th>
					<th>Year</th>
					<th>EMI</th>
					<th>EMI Paid Date</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${LoanEmiDTO}" var="id">
					<tr>
					    <td><c:out value="${id.emiTransId}"></c:out>
						<td><c:out value="${id.customerId}" /></td>
						<td><c:out value="${id.loanId}" /></td>
						<td><c:out value="${id.month}" /></td>
						<td><c:out value="${id.year}" /></td>
						<td><c:out value="${id.emi}" /></td>
						<td><c:out value="${id.loanEmiDate}"/></td>
							
					</tr>
				</c:forEach>
			</tbody>
		</table>

<a href="${pageContext.request.contextPath}/user/userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		
		
<jsp:include page="../footer.jsp"/>
</body>
</html>