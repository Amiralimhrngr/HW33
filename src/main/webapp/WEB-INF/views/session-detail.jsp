<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/10/2026
  Time: 2:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Session Detail</title>
</head>
<body>
<p>${sessionById}</p>
<br>
<a href="${pageContext.request.contextPath}/sessions">Back to sessions</a></body>
</html>
