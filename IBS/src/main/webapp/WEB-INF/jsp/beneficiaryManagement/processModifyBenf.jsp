<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerRegister.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/tableInfo.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<title>Edit Beneficiary Page</title>
</head>
<body class="login_reg">
	<h1 id="welcomeText" align="center">Welcome to Edit Beneficiary page</h1>
	<br/><br/>
	<div align="center">
	<h3>Below are details of the Beneficiary trying to modify</h3>
	</div>
	<br/>
	<table id="customerInfo" style="background: cornsilk;">
			<thead>
				<tr>
					<th>Beneficiary_ID</th>
					<th>Customer_ID</th>
					<th>Beneficiary_Account_HolderName</th>
					<th>Beneficiary_Relation</th>
					<th>Beneficiary_Bank_Name</th>
					<th>Beneficiary_Bank_AccountType</th>
					<th>Beneficiary_Bank_AccountID</th>
					<th>Beneficiary_BankIFSC</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><c:out value="${fetchedBenf.beneficiaryID}" /></td>
					<td><c:out value="${fetchedBenf.customerID}" /></td>
					<td><c:out value="${fetchedBenf.benfAccHolderName}" /></td>
					<td><c:out value="${fetchedBenf.benfRelation}" /></td>
					<td><c:out value="${fetchedBenf.benfBankName}" /></td>
					<td><c:out value="${fetchedBenf.benfBankAccountType}" /></td>
					<td><c:out value="${fetchedBenf.benfBankAccID}" /></td>
					<td><c:out value="${fetchedBenf.benfBankIFSC}" /></td>
				</tr>
			</tbody>
		</table>
	<br/>
	<br/>
	<spring:form class="registerForm" method="POST" action="../../user/saveModifiedBeneficiary" modelAttribute="newModifiedBenf">
		<table>
			<tbody>
				<tr class="heading" align="center">
					<td colspan="2">
						<h2 align="center">Update the details of beneficiary below</h2>
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label path="beneficiaryID">Beneficiary ID :</spring:label></td>
					<td><spring:input type="text" path="beneficiaryID" name="beneficiaryID" value="${fetchedBenf.beneficiaryID}" readonly="true"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfAccHolderName">Beneficiary Holder Name :</spring:label></td>
					<td><spring:input type="text" path="benfAccHolderName" name="benfAccHolderName" value="${fetchedBenf.benfAccHolderName}"/></td>
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
					<td><spring:input type="text" name="benfBankName" path="benfBankName" value="${fetchedBenf.benfBankName}"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfBankAccountType">Beneficiary AccountType : </spring:label></td>
					<td style="color: #d8225d;">
				        <spring:radiobutton path="benfBankAccountType" name="benfBankAccountType" value="Savings" checked="true"/> Savings Account 
				        <spring:radiobutton path="benfBankAccountType" name="benfBankAccountType" value="Credit" /> Credit Account
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfBankAccID">Beneficiary Bank Account ID : </spring:label></td>
					<td><spring:input type="text" name="benfBankAccID" path="benfBankAccID" value="${fetchedBenf.benfBankAccID}"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="benfBankIFSC">Beneficiary Bank IFSC code : </spring:label></td>
					<td><spring:input type="text" name="benfBankIFSC" path="benfBankIFSC" value="${fetchedBenf.benfBankIFSC}"/></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
		<br> 
		<spring:button id="register" type="submit" >Modify</spring:button>
		<a href="../../user/modifyBeneficiary"><input type="button" value="Back" id="btnCancel"/></a>
	</spring:form>
</body>
</html>