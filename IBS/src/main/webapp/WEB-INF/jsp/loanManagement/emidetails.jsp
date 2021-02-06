<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply for Loan</title>
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
</head>
<body>
<jsp:include page="../header.jsp"/>
<h1 style="text-align:center">Loan Details</H1>
<spring:form action="${pageContext.request.contextPath}/user/emiconfirm"  modelAttribute="LoanEmiDTO">

		<center>
			<table id="table" style="background: cornsilk;">
				<tr>
					<center><th colspan="2" ><h2>Loan Details</h2></th></center>
					<br>
				</tr>
				<tr>
					<th><spring:label path = "customerId">Customer ID</spring:label></th>
					<td><spring:input path = "customerId" type ="text" value="${LoanEmiDTO.customerId}" readonly="true" /></td>
				</tr>
				<tr>
					<th><spring:label path = "loanId">Loan ID</spring:label></th>
					<td><spring:input path = "loanId" type ="text" value="${LoanEmiDTO.loanId}" readonly="true" /></td>
				</tr>
				<tr>
					<th><spring:label path = "emi">EMI Amount</spring:label></th>
					<td><spring:input path = "emi" type ="text" value="${LoanEmiDTO.emi}" readonly="true" /></td>
				</tr>
                <tr>
					<th><spring:label path = "loanEmiDate">EMI Payment Date</spring:label></th>
					<td><spring:input path = "loanEmiDate" type ="date"/></td>
				</tr>
                <tr>
					<th><spring:label path = "month">EMI Month</spring:label></th>
					
									<td>   <spring:select path = "month">
									<option value="month">Select the Month</option>
									<option value='01'>January</option>
									<option value='02'>February</option>
								    <option value='03'>March</option>
								    <option value='04'>April</option>
								    <option value='05'>May</option>
								    <option value='06'>June</option>
								    <option value='07'>July</option>
								    <option value='08'>August</option>
								    <option value='09'>September</option>
								    <option value='10'>October</option>
								    <option value='11'>November</option>
								    <option value='12'>December</option>
							</spring:select></td>
				 </tr>
				 <tr>
					<th><spring:label path = "year">EMI Year</spring:label></th>
					<td><spring:select path = "year">
								<option value="year">Select the year</option>
								<option value='2018'>2018</option>
							    <option value='2019'>2019</option>
							    <option value='2020'>2020</option>
							    <option value='2021'>2021</option>
							    <option value='2022'>2022</option>
						</spring:select>
				</tr>
				 
				</table>
         
           
             <input name="Submit" type="submit" value="Pay EMI" />
</spring:form>


<a href="${pageContext.request.contextPath}/user/userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		
		
<jsp:include page="../footer.jsp"/>
</body>
</html>