<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>

<html>

<head>
	<title>Monthly  Statement</title>
	
	<!-- reference our style sheet -->

</head>

<body>

<jsp:include page="header.jsp"/>
		<spring:form method="post" action="${pageContext.request.contextPath}/user/MonthlyStatementDisplay/${custID}" modelAttribute="transactionInputDto">
		<h1 align="center" class="a">Monthly Statement  Generation</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Statement Generation</th>
			</tr>
			
			
			<tr>
				
				<td><spring:select path = "month"><option value="month">Select the Month</option>
				<option value='1'>January</option>
				<option value='2'>February</option>
			    <option value='3'>March</option>
			    <option value='4'>April</option>
			    <option value='5'>May</option>
			    <option value='6'>June</option>
			    <option value='7'>July</option>
			    <option value='8'>August</option>
			    <option value='9'>September</option>
			    <option value='10'>October</option>
			    <option value='11'>November</option>
			    <option value='12'>December</option>
				</spring:select>
				</td>
			</tr>
			
			<tr>
				
				<td><spring:select path = "year"><option value="year">Select the year</option>
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
				</spring:select>
				</td>
			</tr>
			
		</table>
		<br>
		<spring:button class="btn btn-danger btn-sm" type ="submit"><b>GENERATE</b></spring:button>
		</spring:form>
		
		<jsp:include page="footer.jsp"/>
	
</body>

</html>









