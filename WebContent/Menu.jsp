<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Menu</title>
</head>

<body>

	<!-- The property struts tag reads the value off the value stack.  In our case
	       the Struts 2 framework has automatically made the Java bean properties of
	       our action available to the result.  We just need to match the nomenclature
	       of our value parameter below with the Java Beans attribute name of our 
	       HelloWorld action.  
	  -->
	<hr>
	<ol>
		<li><a href="<s:url action='registrazione/Registration'/>">Registrati</a> </li>
		 <li><a href="<s:url action='registrazione/LoginForm'/>">login</a></li>
		 <li><a href="<s:url action='ricerca/Ricerca'/>">Uso di JSON</a></li>
		<!--<li><a href="<s:url action='esempio2/Registration'/>">Passaggio	dati (con Javabeans)</a></li>
		<li><a href="<s:url action='esempio3/Registration'/>">Passaggio	dati (con ModelDriven)</a></li>
		<li><a href="<s:url action='esempio4/Registration'/>">Validazione (con Workflow)</a></li>
		<li><a href="<s:url action='esempio5/Registration'/>">Validazione (con Validation)</a></li>
		<li><a href="<s:url action='esempio6/Registration'/>">Errori e avvisi</a></li>
		<li><a href="<s:url action='esempio7/Registration'/>">Gestione eccezioni</a></li>
		<li><a href="<s:url action='esempio8/Registration'/>">Resource Bundles</a></li>
		<li><a href="<s:url action='esempio9/Registration'/>">Resource Bundles (bad)</a><br> <a
			href="<s:url action='esempio9ok/Registration'/>">Resource Bundles (ok)</a><br> <a
			href="<s:url action='esempio9ok2/Registration'/>">Resource Bundles (con parametri numerici)</a></li>
		<li><a href="<s:url action='esempio10/Registration'/>">Conversioni di tipo</a></li>
		<li><a href="<s:url action='esempio11/Registration'/>">Creare un Validator</a></li>
		<li><a href="<s:url action='esempio12/Registration'/>">Interceptor Timer e Logger</a></li>
		<li><a href="<s:url action='esempio13/LoginForm'/>">Form di	login</a></li>
		<li><a href="<s:url action='esempio14/Registration'/>">Uso dei tag UI</a></li>
		<li><a href="<s:url action='esempio15/Ricerca'/>">Uso di JSON</a></li> -->
	</ol>
	<hr>
</body>

</html>
