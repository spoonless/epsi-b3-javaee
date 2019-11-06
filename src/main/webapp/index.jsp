<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
<c:url value="/params.jsp" var="lienPageParametres">
	<c:param name="language" value="java"/>
	<c:param name="version" value="1.6"/>
	<c:param name="version" value="1.7"/>
	<c:param name="version" value="1.8"/>
	<c:param name="motto" value="<strong>compile once, run anywhere</strong>"/>
</c:url>
<ul>
	<li><a href='<c:url value="/produit.html" />'>Saisir un produit avec son code</a></li>
	<li><a href='<c:url value="/date.jsp" />'>Date du serveur</a></li>
	<li><a href="${lienPageParametres}">Les paramètres</a></li>
	<li>
		<form action='<c:url value="/hello.jsp" />' accept-charset="latin-1">
			<button type="submit">Saluer</button>
			<input type="text" name="who">
		</form>
	</li>
</ul>
</body>
</html>