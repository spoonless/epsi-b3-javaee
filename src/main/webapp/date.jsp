<%@page pageEncoding="UTF-8" contentType="text/html" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    </head>
    <body>
        <jsp:useBean id="now" scope="page" class="java.util.Date"/>
        <fmt:formatDate value="${now}" type="both" dateStyle="long"/>
    </body>
</html>