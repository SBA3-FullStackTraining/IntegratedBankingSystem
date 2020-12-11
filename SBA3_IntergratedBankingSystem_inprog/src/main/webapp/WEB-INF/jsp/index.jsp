<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <link rel="stylesheet" type="text/css" href="static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/background.css" />  
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/customerLogin.css" /> 
<script type="text/javascript" src="static/js/index.js"></script>
<title>Login Page</title>
</head>
<body class="login_reg">
<h1 id="welcomeText" align="center">Welcome to Integrated Banking System</h1>
	<br/><br/><br/><br/><br/>
	<div class="tab"> 

		<input type="button" class="tablinks" value="Customer" onclick="doLogin(event, 'Customer')" id="defaultOpen" >
		<input type="button" class="tablinks" value="Admin" onclick="doLogin(event, 'Admin')">
	</div>

	<div id="Customer" class="tabcontent">
		<spring:form class="custLoginform" method="post" action="user/Home">
		<table>
			<tbody>
				<tr>
					<td align="right"><label>Customer ID :</label></td>
					<td><input type="text" name="customerID" /></td>
				</tr>
				<tr>
					<td align="right"><label>Password : </label></td>
					<td><input type="password" name="password" /></td>
				</tr>
			</tbody>
		</table>
		<br/>
		<input type="submit" value="Login" id="login" />
		<input type="button" value="Register" id="register" onclick="location.href='./resources/html/customerRegister.html';" style="margin-left: 70px;"/>
		<br/><br/>
		<input type="button" value="forgot password" id="forgotpass" />		
	</spring:form>
	</div>

	<div id="Admin" class="tabcontent">
		<spring:form class="adminLoginform" method="post" action="adminHome">
		<table>
			<tbody>
				<tr>
					<td align="right"><label>Admin ID :</label></td>
					<td><input type="text" name="adminID" /></td>
				</tr>
				<tr>
					<td align="right"><label>Password : </label></td>
					<td><input type="password" name="password" /></td>
				</tr>
			</tbody>
		</table>
		<br/>
		<input type="submit" value="Login" id="login" />
		<br/><br/>
		<input type="button" value="forgot password" id="forgotpass" />
	</spring:form>
	</div>
	
	<script>document.getElementById("defaultOpen").click();</script>
	<jsp:include page="footer.jsp"/>
</body>
</html>