<%@page pageEncoding="UTF-8" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="UTF-8">
    <title>Java EE - Exemple MVC</title>
  </head>
  <body>
  	<form action="" accept-charset="utf-8" method="post">
  		<label>Civilite :</label>
  		<select name="civilite">
  			<option>--</option>
  			<c:forEach items="${ listeCivilites }" var="c">
  				<option value='<c:out value="${c.id}"/>' ${c.id == param['civilite'] ? "selected" : ""}>
  					<c:out value="${c.nom }"/>
  				</option>
  			</c:forEach>
  		</select>
  		<c:out value="${erreurs['civilite']}"/><br>
  		<br>
  		<label>Nom :</label>
  		<input type="text" name="nom" value='<c:out value="${param['nom']}"/>'>
  		<c:out value="${erreurs['nom']}"/><br>
  		<br>
  		<label>Email :</label>
  		<input type="text" name="email" value='<c:out value="${param['email']}"/>'>
  		<c:out value="${erreurs['email']}"/><br>
  		<br>
  		<label>Age :</label>
  		<input type="number" name="age" value='<c:out value="${param['age']}"/>'>
  		<c:out value="${erreurs['age']}"/><br>
  		<br>
  		<input type="submit">
  	</form>
	<div>
	  	<a href='<c:url value="/"/>'>Retour à l'accueil</a>  
	</div>
  </body>
</html>
