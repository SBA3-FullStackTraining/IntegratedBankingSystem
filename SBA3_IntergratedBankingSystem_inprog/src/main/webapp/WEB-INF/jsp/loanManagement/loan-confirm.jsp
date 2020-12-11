<%@page import="com.banking.ibs.dto.ApplyLoan"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "LightBlue">
<%
ApplyLoan apply2 = (ApplyLoan) session.getAttribute("applyloan");
   
%>
<H2>Thanks for Applying Loan</H2>
<H2>Your Loan Details are : </H2>
<H3>Loan Application Number :</H3><%=apply2.getAppnumber()%>
<H3>Loan Type :</H3><%=apply2.getLoantype() %>
<H3>Loan Amount :</H3><%=apply2.getLoanamt() %>
<h3>Loan Tenure :</h3><%=apply2.getloantenure() %>

<h2>Loan Representative will Contact you in regard!!</h2>
</body>
</html>