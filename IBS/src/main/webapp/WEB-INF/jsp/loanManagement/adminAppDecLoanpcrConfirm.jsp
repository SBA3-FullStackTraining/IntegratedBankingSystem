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
<h1 style="text-align:center">Loan Closed Successfully</H1>
<h3>Customer ID        :${LoanOutputDTO.customerId}</h3>
<h3>Loan ID            :${LoanOutputDTO.loanId}</h3>
<h3>Loan Amount        :${LoanOutputDTO.loanAmount}</h3>
<h3>Loan Tenure        :${LoanOutputDTO.loanTenure}</h3>
<h3>Status             :${LoanOutputDTO.status}</h3>

                  
	<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		
	<br>
	<br>
		<jsp:include page="../footer.jsp"/>
</body>
</html>