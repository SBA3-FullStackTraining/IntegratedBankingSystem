<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerRegister.css" />
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<title>Add Beneficiary Page</title>
</head>
<body class="login_reg">
	<h1 id="welcomeText" align="center">Welcome to Add Beneficiary page</h1>
	<br/>

	<br/><br/>
	<spring:form class="registerForm" method="POST" action="../user/newBeneficiary" modelAttribute="newBenf">
		<table>
			<tbody>
				<tr class="heading" align="center">
					<td colspan="2">
						<h2>Fill in the details</h2>
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfAccHolderName">Beneficiary Holder Name :</spring:label></td>
					<td><spring:input type="text" path="benfAccHolderName" name="benfAccHolderName" /></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfRelation">Beneficiary Relation : </spring:label></td>
					<td>
						<spring:select path="benfRelation">  
					        <spring:option value="Self" label="Self"/>  
					        <spring:option value="Friend" label="Friend"/> 
					        <spring:option value="Family" label="Family"/>   
					        <spring:option value="Relative" label="Relative"/>  
			        	</spring:select>  
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfBankName">Beneficiary Bank Name : </spring:label></td>
					<td><spring:input type="text" name="benfBankName" path="benfBankName"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfBankAccountType">Beneficiary AccountType : </spring:label></td>
					<td style="color: #d8225d;">
				        <spring:radiobutton path="benfBankAccountType" name="benfBankAccountType" value="Savings"/> Savings Account 
				        <spring:radiobutton path="benfBankAccountType" name="benfBankAccountType" value="Credits"/> Credits Account 
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfBankAccID">Beneficiary Bank Account ID : </spring:label></td>
					<td><spring:input type="text" name="benfBankAccID" path="benfBankAccID"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfBankIFSC">Beneficiary Bank IFSC code : </spring:label></td>
					<td><spring:input type="text" name="benfBankIFSC" path="benfBankIFSC"/></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
		<br> 
		<spring:button id="register" type="submit" >Register</spring:button>
		<a href="../user/userHome"><input type="button" value="cancel" id="btnCancel"/></a>
	</spring:form>
</body>
</html>