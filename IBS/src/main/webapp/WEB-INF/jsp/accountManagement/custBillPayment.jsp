<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
<style>
h2{color: red;
}
h3{color: black;
}
</style>
<title>Bill Payment</title>
</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<spring:form method="post" action ="${pageContext.request.contextPath}/user/BillPayment_Success" 
			modelAttribute="transactionDTO">
			<h1 align="center" class="a">BILL PAYMENT</h1>
			<br><br>
			<center>
			<table id="table">
				<tr>
					<center><th colspan="2" ><h2>BILL PAYMENT</h2></th></center>
					<br>
				</tr>
				<center><h3>Now make your utility bill payments for <b><h2>Mobile prepaid/Postpaid,Electricity,DTH,Water,Natural Gas,BroadBand</h2></b> more secured and easy via IBS with Service Providers registered with us..</h3></center>
				<tr>
					<th><spring:label path = "customerId">Customer ID</spring:label></th>
					<td><spring:input path = "customerId" type ="text" value="${savings.customerId}" readonly="true" /></td>
				</tr>
				
				
				<tr>
					<th><spring:label path="savingsAccID">Savings Account ID</spring:label></th>
					<td><spring:input path="savingsAccID" type ="text" value="${savings.savingsAccID}" readonly="true" /></td>
				</tr>
				
				
				<tr>
					<th><label>Available Balance</label></th>
					<td><input type ="text" value="${savings.avlBalance}" readonly="true"/></td>
				</tr>
				
				
				<tr>
					<th><label>Customer Name</label></th>
					<td><input type ="text" value="${savings.accHolderName}" readonly="true"/></td>
				</tr>
				
				<!-- <tr>
					<th><label>Select Month</label></th>
					<td><select>
					    <c:forEach var="spi" items="${ServiceProvider.SPI}">
					        <option><c:set var="spid" value="${spi}" /><c:out value="${spid}"/></option>
					    </c:forEach>
					</select></td>
				</tr> -->
				
				
				
				<!--<select name='lists'>  
				   <c:forEach var="list" items="${ServiceProvider.SPIUtility}">
				       <option value="${list.value.getSPIUtility()}">${list.value.getSPIUtility()}</option>   
				   </c:forEach>
				</select>  -->
				<!--<sql:setDataSource var="ds" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ibs?createDatabaseIfNotExist=true&useSSL=false" user="root" password="root"/>
				<sql:query dataSource="${ds}" var="result"> 
				    SELECT * from service_provider;
				</sql:query>
				
				<c:forEach var="row" items="${result.rows}"> 
				      <option value='<c:out value="${row.key}"/>'><c:out value="${row.value}"/></option>
				</c:forEach>  -->
				
				<tr>
					<th><spring:label path="toAccDetails">Service Provider Utility</spring:label></th>
					<td><spring:select path="toAccDetails">
					    <c:forEach var="sp" items="${serviceProvider}">
					        <option  value="${sp.spiUtility}-${sp.providerDetails}-${sp.spi}">${sp.spiUtility}-${sp.providerDetails}-${sp.spi}</option>
					    </c:forEach>
					</spring:select></td>
					
					

				</tr>
				
				<tr>
					<th><spring:label path="amount">Bill Amount</spring:label></th>
					<td><spring:input path="amount" type ="text"/></td>
				</tr>
				
				<!--<tr>
					<th><label>Service provider Account</label></th>
					<td><select>
					    <c:forEach var="sp" items="${serviceProvider}">
					        <option value="${sp.providerDetails}">${sp.providerDetails}</option>
					    </c:forEach>
					</select></td>
				</tr>
				  -->
				<tr>
					<th><spring:label  path = "lastTransationDate" >Transfer date</spring:label></th>
					<td><spring:input path = "lastTransationDate" type ="date"/></td>
				</tr>
				
			
			</table>
			</center>
			<br>
		<spring:button id="btnBack" type = "submit"><b>PAY BILL</b></spring:button>
		
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