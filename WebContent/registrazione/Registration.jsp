<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Registration</title>
	</head>

	<body>
	    <hr>
		<h4>Registrazione</h4> 	
		<s:form action="Register">
    	<s:textfield name="utente.name" label="Real Name"/>
    	<s:textfield name="utente.utentename" label="utentename"/>
    	<s:password name="utente.password" label="Password"/>
    	
    	<s:submit/>
		</s:form>
	    <hr>	
	</body>
	
</html>
