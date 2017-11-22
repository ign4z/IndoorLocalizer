<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
    <title>Registrazione Effettuata</title>
	</head>

	<body>

	  <hr>
	    <h3>Registrazione Effettuata</h3>      
        <p>Caro <s:property value="Utente.name"/>, 
        sei stato registrato nel sistema con 
        Utentename <i><s:property value="Utente.Utentename" /></i> e 
        password <i><s:property value="Utente.password" /></i>.
        <br />
        Grazie.
        </p>
      <hr>
	</body>
	
</html>
