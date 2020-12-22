<%@page import="com.banking.ibs.dto.ServiceProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Confirmation</title>
</head>
<body bgcolor = "LightBlue">
<%
 ServiceProvider sp = (ServiceProvider) session.getAttribute("billamount");
 
%>
<H2>Bill Payment Receipt</H2>
<H2>Your Bill Payment Details are:</H2>
<H3>Bill Amount Paid :</H3><%=sp.getBillamount()%>



</body>
</html>