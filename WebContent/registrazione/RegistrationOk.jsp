<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
    <title>Registrazione Effettuata</title>
	</head>

	<body>

	  <hr>
	    <h3>Registrazione Effettuata</h3>      
	     <p>Caro <s:property value="Utente.nome"/>, sei stato registrato nel sistema con email <i><s:property value="Utente.email" /></i> e password <i><s:property value="Utente.pwd" /></i>.
	    <s:text name="text.registrationok">
          <s:param value="utente.nome" />
          <s:param value="utente.pwd" />
        </s:text>
        <br />
        Grazie.
        </p>
      <hr>
	</body>
	
</html>
