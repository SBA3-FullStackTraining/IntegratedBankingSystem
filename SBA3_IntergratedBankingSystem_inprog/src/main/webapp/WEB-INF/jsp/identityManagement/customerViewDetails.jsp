<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.banking.ibs.springboot.dto.CustomerDTO"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/background.css" />
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/viewDetails.css" />
<script type="text/javascript" src="static/js/viewDetails.js"></script>
<title>View my Details Page</title>
</head>
<body >
<jsp:include page="header.jsp"/>
	<h1 id="welcomeText" align="center">Customer details</h1>
	<br/>
	<div class="tab"> 
		<spring:input type="button" class="tablinks" value="Personal" onclick="viewInfo(event, 'Personal')" id="defaultOpen" />
		<spring:input type="button" class="tablinks" value="Account" onclick="viewInfo(event, 'Account')"/>
	</div>

	<%
		String username = session.getAttribute("username").toString();
		CustomerDTO customerData = (CustomerDTO) session.getAttribute("customerInfo");
	%>

	<div id="Personal" class="tabcontent">
		<table>
			<tbody>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><spring:label>First Name : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getFirstName()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Last Name : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getLastName()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Phone : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getPhoneNumber()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Email : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getEmail()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Date of Birth : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getDateOfBirth()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>City : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getCity()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>State : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getState()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Country : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getCountry()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Pincode : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getPincode()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Address : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getFullAddress()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>Select ID : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getGivenID()%></spring:label></td>
				</tr>
				<tr>
					<td><spring:label>ID number : </spring:label></td>
					<td><spring:label class="info" ><%=customerData.getIDNumber()%></spring:label></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
	</div>

	<div id="Account" class="tabcontent">
	<table>
			<tbody>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td ><spring:label>Account ID : </spring:label></td>
					<td><spring:label class="info" ></spring:label></td>
				</tr>
			</tbody>
	</table>
	</div>
	
	<br> 
	<spring:form method="POST" action="customerHome">
		<spring:input type="submit" value="Back" id="btnBack"/>
	</spring:form>
	
	<!-- <input type="button" value="back" id="btnBack" onclick="history.back()"/> -->
	
	<script>document.getElementById("defaultOpen").click();</script>
<jsp:include page="header.jsp"/>
</body>
</html>