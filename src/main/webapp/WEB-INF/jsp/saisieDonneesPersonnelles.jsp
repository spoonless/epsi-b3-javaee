<%@page pageEncoding="UTF-8" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="UTF-8">
    <title>Java EE - Exemple MVC</title>
  </head>
  <body>
  	<div>
  		<c:out value="${message}"/>
  	</div>
  	<form action="" accept-charset="utf-8" method="post">
  		<label>Nom :</label>
  		<input type="text" name="nom" value='<c:out value="${donneesPersonnelles.nom}"/>'>
  		<label>Age :</label>
  		<input type="number" name="age" value="${donneesPersonnelles.age}">
  		<input type="submit">
  	</form>
	<div>
	  	<a href='<c:url value="/"/>'>Retour à l'accueil</a>  
	</div>
  </body>
</html>
