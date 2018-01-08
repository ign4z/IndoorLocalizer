<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Login</title>
	</head>

	<body>
	    <hr>
		<h4>Login</h4> 	
		<div style="background-color: #ffff00;">
			<s:actionerror />
		</div>
		<s:form action="Login">
    	<s:textfield name="email" label="email"/>
    	<s:password name="pwd" label="Password"/>
    	<a href="<s:url action='/Registration'/>">registrati</a>
    	<s:submit/>
		</s:form>
	    <hr>	
	</body>
	
</html>
