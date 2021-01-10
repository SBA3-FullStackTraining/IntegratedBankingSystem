<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
	
	<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<title>Fund Transfer</title>
</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<spring:form method="post" action ="${pageContext.request.contextPath}/user/FundTransfer_Success" 
			modelAttribute="transactionDTO">
			<h1 align="center" class="a">Fund transfer</h1>
			<br><br>
			<center><h3>Now transfer your funds to any added beneficiary in a  more secured and easy way via IBS..</h3>
			<h2>To add a Beneficiary, Please navigate to Beneficiary->Add Beneficiary under Beneficiary Management Tab</h2></center>
			<center>
			<table id="tablefixed">
				<tr>
					<center><th colspan="2">Fund transfer</th></center>
					<br>
				</tr>
				
				<tr>
					<th><spring:label  path = "customerId">Customer ID</spring:label></th>
					<td><spring:input path = "customerId" type ="text" value="${savings.customerId}" readonly="true" /></td>
				</tr>
				
				<tr>
					<th><label>Customer Name</label></th>
					<td><input  type ="text" value="${savings.accHolderName}" readonly="true"/></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "savingsAccID">Savings Account(FromAccount)</spring:label></th>
					<td><spring:input path = "savingsAccID" type ="text" value="${savings.savingsAccID}" readonly="true"/></td>
				</tr>
				
				<tr>
					<th><label>Available Balance</label></th>
					<td><input  type ="text" value="${savings.avlBalance}" readonly="true"/></td>
				</tr>
				<tr>
					<th><spring:label path = "toAccDetails">Beneficiary Account(ToAccount)</spring:label></th>
					<td><spring:select path = "toAccDetails">
					    <c:forEach var="benf" items="${beneficiary}">
					        <option value="${benf.benfBankAccID}-${benf.benfAccHolderName}">${benf.benfBankAccID}-${benf.benfAccHolderName}</option>
					    </c:forEach>
					</spring:select></td>
					
					

				</tr>
				
				<tr>
					<th><spring:label  path = "lastTransationDate" >Transfer date</spring:label></th>
					<td><spring:input path = "lastTransationDate" type ="date"/></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "amount" >Transfer Amount</spring:label></th>
					<td><spring:input path = "amount" type ="text"/></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "message" >Transfer Description</spring:label></th>
					<td><spring:input path = "message" type ="text" /></td>
				</tr>
				
				<tr>
					<th><label>Transaction Password</label></th>
					<td><input type ="password"/></td>
				</tr>
			</table>
			</center>
			<br>
		<spring:button id="btnBack" type = "submit"><b>TRANSFER</b></spring:button>
		
		</spring:form>
		<br>
		<br>
	
		<center>
			<a href="userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
	<br>
	<br>
		<jsp:include page="../footer.jsp"/>
	</body>
</html>