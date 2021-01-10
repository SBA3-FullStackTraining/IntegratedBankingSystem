<%@page import="com.banking.ibs.dto.Payemi"%>
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
 Payemi emipay2 = (Payemi) session.getAttribute("emipay");
 
%>
<H2>EMI Payment Receipt</H2>
<H2>Your EMI Payment Details are:</H2>
<H3>EMI Amount Paid :</H3><%=emipay2.getEmiamount()%>
<H3>Month :</H3><%=emipay2.getMonth() %>
<h3>Year :</h3><%=emipay2.getYear() %>


</body>
</html>