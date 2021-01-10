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
	<title>Yearly  Statement</title>
	
	<!-- reference our style sheet -->

</head>

<body>

<jsp:include page="../header.jsp"/>
		<spring:form method="post" action="${pageContext.request.contextPath}/user/AnnualStatementDisplay" modelAttribute="transactionInputDto">
		<h1 align="center" class="a">Yearly Statement  Generation</h1>
		<br><br>
				<label>Select Year</label>
				<spring:select path = "year"><option value="month">Annual Year</option>
					<option value='2010-2011'>2010-2011</option>
					<option value='2011-2012'>2011-2012</option>
				    <option value='2012-2013'>2012-2013</option>
				    <option value='2013-2014'>2013-2014</option>
				    <option value='2014-2015'>2014-2015</option>
				    <option value='2015-2016'>2015-2016</option>
				    <option value='2016-2017'>2016-2017</option>
				    <option value='2017-2018'>2017-2018</option>
				    <option value='2018-2019'>2018-2019</option>
				    <option value='2019-2020'>2019-2020</option>
				    <option value='2020-2021'>2020-2021</option>
				</spring:select>
				
		<br>
		<spring:button id="btnBack" type ="submit"><b>GENERATE</b></spring:button>
		</spring:form>
		<br>
		<br>
		<center>
			<a href="userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
		<br>
		<jsp:include page="../footer.jsp"/>
	
</body>

</html>









