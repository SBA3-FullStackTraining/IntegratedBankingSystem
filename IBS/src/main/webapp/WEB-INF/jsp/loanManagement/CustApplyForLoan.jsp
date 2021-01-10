<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply for Loan</title>
<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/custapplyforloan.css" />
		<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/background.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<h1 style="text-align:center">Apply for Loan</H1>
<h2>Select the loan you want to apply</h2> <br/>
<spring:form action="loansummary" method="Post">
<spring:select path="loanName">
 <spring:option value="Personal" selected>Personal</spring:option>
 <spring:option value="Vehicle">Vehicle</spring:option>
 <spring:option value="Educational">Educational</spring:option>
 <spring:option value="Home">Home</spring:option>
</spring:select>
<hr/>
<table>
<tr>Enter the Loan Amount<spring:input type="text" name="loanAmount" path="loanAmount"/></tr>
<BR/>
<div>
				<div>
					<label for="BusinessStruture">BusinessStruture</label>
				</div>
				<div>

					<input type="radio" id="Individual" name="BusinessStruture"
						value="Individual" required> <label for="Individual">Individual</label>
					<input type="radio" id="Organisation" name="BusinessStruture"
						value="Organisation" required> <label for="Organisation">Organisation</label>

				</div>
			</div>

			<div>
				<div>
					<label for="BillingIndicator">BillingIndicator</label>
				</div>
				<div>
				<spring:input type="radio" id="Salaried_Person" name="billingIndicator" path="billingIndicator"
						value="Salaried Person" required></spring:input> <label
						for="Salaried Person">Salaried Person</label> 
						<spring:input type="radio" id="Non Salaried Person" name="billingIndicator" path="billingIndicator"
						value="Non Salaried Person" required></spring:input> <label
						for="Non Salaried Person">Non Salaried Person</label>
				</div>
			</div>


				<div>
					<label for="TaxIndicator">TaxIndicator</label>
				</div>
				<div>
					<spring:input type="radio" id="TaxPayee" name="taxIndicator" value="Yes" required path="taxIndicator"></spring:input>
					<label for="Yes">Yes</label> 
					<spring:input type="radio" id="No" name="TaxIndicator" value="No" path="taxIndicator" required></spring:input> 
						<label for="No">No</label>
				</div>
<label>Select Tenure in Months</label>
<spring:select path=loanMonths name=loanMonths id=loanMonths>
	<spring:option value=12>12</spring:option>
	<spring:option value=24>24</spring:option>
	<spring:option value=36>36</spring:option>
	<spring:option value=48>48</spring:option>
	<spring:option value=60>60</spring:option>
	<spring:option value=240>240</spring:option>
</spring:select>
</table>
<input type="submit" value="Apply for Loan">
</spring:form>
</body>
</html>