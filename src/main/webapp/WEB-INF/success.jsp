<%--
  Created by IntelliJ IDEA.
  User: san_d
  Date: 22/06/2021
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>SUCCESS</h1>
<h2>ROUB Y GNOLE !</h2>
<div>
    <c:if test="${!empty sessionScope.utilisateur}">
        <h2>${sessionScope.utilisateur.pseudo}</h2>
        <h2>Connecté</h2>
    </c:if>

    <a href="servletOpenCompte">
</div>
</body>
</html>
