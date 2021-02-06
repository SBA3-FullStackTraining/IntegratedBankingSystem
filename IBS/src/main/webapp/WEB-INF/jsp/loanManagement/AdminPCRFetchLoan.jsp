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
<h1 style="text-align:center">Pre-Closure Requested Loans</H1>


  <h3>List Of Loans Requested for Pre Closure : </h3>
  										<c:forEach items="${LoanOutputDTO}" var="id">
  											<input type="text" name="loanId" value="${id.loanId}" readonly="true"></input>	
  																
  										
  		<a href="../admin/AppDecLoanPCR/${id.loanId}"><input type="button" value="Fetch Loan" id="FetchLoan"/></a></br>
	</c:forEach>	
<%--   <spring:form action="${pageContext.request.contextPath}/admin/AppDecLoan" modelAttribute="LoanOutputDTO">										
  <h3>Enter the Loan ID From the List above</h3>
  					<table>
  					<tr>
					<th><spring:label path = "loanId">Loan ID</spring:label></th>
					<td><spring:input path = "loanId" type ="text"/></td>
					</tr>
					</table> --%>


           
           
             <!-- <input name="Submit" type="submit" value="Fetch Loan" /> -->
         


<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		
		
<jsp:include page="../footer.jsp"/>
</body>
</html>