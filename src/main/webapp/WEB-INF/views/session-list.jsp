<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/10/2026
  Time: 2:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Study Session</title>
</head>
<body>
<h1>Study Session</h1>
<c:forEach var="session" items="${sessions}">
    <p>${session}</p><br>
    <a href="${pageContext.request.contextPath}/sessions/detail?id=${session.id}">
        View details
    </a><br>
</c:forEach>
<a href="${pageContext.request.contextPath}/sessions/add">Add a new session</a>
<a href="${pageContext.request.contextPath}/subjects">View all subjects</a>
</body>
</html>
