<%@page import="com.banking.wf.springbootappibs.dto.LoanEmiDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="ISO-8859-1"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/background.css" />
<title>Payment Confirmation</title>
</head>
<body bgcolor = "LightBlue">
<%
 LoanEmiDTO emipay2 = (LoanEmiDTO) session.getAttribute("emipay");
 
%>
<H2>EMI Payment Receipt</H2>
<H2>Your EMI Payment Details are:</H2>
<H3>EMI Amount Paid :</H3><%=emipay2.getEmiAmount()%>
<H3>Month :</H3><%=emipay2.getMonth() %>
<h3>Year :</h3><%=emipay2.getYear() %>


</body>
</html>