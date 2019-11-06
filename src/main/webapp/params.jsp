<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Params</title>
</head>
<body>
	<table border="1">
		<tbody>
		<c:forEach items="${paramValues}" var="p">
		<tr>
			<td><c:out value="${p.key}"/></td>
			<td><c:out value="${fn:join(p.value, ', ')}"/></td>
		</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
