<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply for Loan</title>
<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/custapplyforloan.css" />
		<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/background.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		
		<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
</head>
<body>
<jsp:include page="../header.jsp"/>
<h1 style="text-align:center">Apply for Loan</H1>
<spring:form action="${pageContext.request.contextPath}/user/LoanApplied" modelAttribute="LoanDTO">
                    <table>
                    Customer ID : <spring:input path="customerId" value="${Id}" readonly="true"></spring:input>
                    </br>
                    Loan Name :<spring:select path="loanName">
					 <option value="Personal">Personal</option>
					 <option value="Vehicle">Vehicle</option>
					 <option value="Educational">Educational</option>
					 <option value="Home">Home<option>
				</spring:select>
				
				<div>	
					<tr>Enter the Loan Amount :<spring:input path="loanAmount"></spring:input></tr>
				<br>
				</div>
				Loan Application Date :<spring:input path="loanApplicationDate" type="date"/>
				<div>>
					Business Structure :
					
					Individual <spring:radiobutton path="businessStructure" value="Individual" />
					Organization <spring:radiobutton path="businessStructure" value="Organization" />
				</div>
			</div>

			<div>
				<div>
					BillingIndicator :
						
				    Salaried <spring:radiobutton path="billingIndicator" value="Salaried" />
				    Business <spring:radiobutton path="billingIndicator" value="Business" />
				</div>
			</div>


				<div>
					TaxIndicator :
				   
				    Yes <spring:radiobutton path="taxIndicator" value="Yes"/>
					No <spring:radiobutton path="taxIndicator" value="No"/>
				</div>
				<div>
               Select Tenure in Months  :<spring:select path="loanTenure">
						<option value=12>12</option>
						<option value=24>24</option>
						<option value=36>36</option>
						<option value=48>48</option>
						<option value=60>60</option>
						<option value=120>120</option>
						<option value=180>180</option>
						<option value=240>240</option>
					</spring:select>
					</div>
				<spring:hidden path="status" value="Submitted"></spring:hidden>
				<spring:hidden path="loanInterestRate" value="0.0"></spring:hidden>
				<br>
				Remark :<spring:input path="remark"></spring:input>	
					</table>
             <input name="Submit" type="submit" value="Apply For Loan" />
             </spring:form>
        
		<a href="userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		
	<br>
	<br>
		<jsp:include page="../footer.jsp"/>
</body>
</html>