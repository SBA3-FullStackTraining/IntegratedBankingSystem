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
	<title>Periodic  Statement</title>
	
	<!-- reference our style sheet -->

</head>

<body>

<jsp:include page="../header.jsp"/>
		<spring:form method="post" action="${pageContext.request.contextPath}/admin/PeriodicStatementDisplay" modelAttribute="transactionInputDto">
		<h1 align="center" >Periodic Statement  Generation</h1>
		<br><br>
			
			
			<div>
				<spring:label  path = "customerId">Enter Customer ID</spring:label>
				<div>
					<spring:input path = "customerId" type ="text" />
				 </div>
			   <spring:label path="startDate">Start Date</spring:label>
			    <div>
			      <spring:input path="startDate" type="date" />
			    </div>
			    <spring:label path="endDate">End Date</spring:label>
			    <div>
			      <spring:input path="endDate" type="date" />
			    </div>
			</div>
			
		
		<br>
		<spring:button id="btnBack" type ="submit"><b>GENERATE</b></spring:button>
		</spring:form>
		<br>
		<br>
		<br>
		<center>
			<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
		<br>
		<jsp:include page="../footer.jsp"/>
	
</body>

</html>









