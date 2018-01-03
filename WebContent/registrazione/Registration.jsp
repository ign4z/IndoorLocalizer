<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Registration</title>
	</head>

	<body>
	    <hr>
		<h4>Registrazione</h4> 	
		
		<div style="background-color: #ff0000;">
		<s:fielderror></s:fielderror>
		</div>
		<div style="background-color: #ffaacc;">
			<s:actionerror />
		</div>
		
		
		<s:form action="Register">
    	<s:textfield name="utente.nome" key="utente.nome"/>
    	<s:textfield name="utente.cognome" label="cognome"/>
    	<s:textfield name="utente.email" label="email"/>
    	<s:password name="utente.pwd" label="Password"/>
 
    	<s:submit/>
		</s:form>
	    <hr>	
	</body>
	
</html>
