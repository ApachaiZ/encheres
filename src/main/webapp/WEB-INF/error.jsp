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
    <title>ERROR</title>
</head>
<body>
<h1>ERROR</h1>
<h2>ROUB Y DEAD !</h2>
<div>
    <c:if test="${empty sessionScope.utilisateur}">
        <h2>PAS Connecté</h2>
    </c:if>
</div>
</body>
</html>
