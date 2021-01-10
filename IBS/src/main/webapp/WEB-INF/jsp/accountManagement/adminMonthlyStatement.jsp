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
	<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/index.css" />
	<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
	
	<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
	<title>Monthly  Statement</title>
	
	<!-- reference our style sheet -->

</head>

<body>

<jsp:include page="../header.jsp"/>
		<spring:form method="post" action="${pageContext.request.contextPath}/admin/MonthlyStatementDisplay" modelAttribute="transactionInputDto">
		<h1 align="center" class="a">Monthly Statement  Generation</h1>
		<br><br>
		<spring:label  path = "customerId">Enter Customer ID</spring:label>
		<spring:input path = "customerId" type ="text" />
		
		<label>Select Month</label>
		<spring:select path = "month"><option value="month">Select the Month</option>
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
		</spring:select>
		<label>Select Year</label>
		<spring:select path = "year"><option value="year">Select the year</option>
				<option value='2010'>2010</option>
				<option value='2011'>2011</option>
			    <option value='2012'>2012</option>
			    <option value='2013'>2013</option>
			    <option value='2014'>2014</option>
			    <option value='2015'>2015</option>
			    <option value='2016'>2016</option>
			    <option value='2017'>2017</option>
			    <option value='2018'>2018</option>
			    <option value='2019'>2019</option>
			    <option value='2020'>2020</option>
			    <option value='2021'>2021</option>
		</spring:select>
			
		<br>
		<br>
		<br>
		<spring:button type ="submit" id="btnBack"><b>GENERATE</b></spring:button>
		</spring:form>
		<br>
		<br>
		<br>
		<center>
			<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
		<jsp:include page="../footer.jsp"/>
	
</body>

</html>









