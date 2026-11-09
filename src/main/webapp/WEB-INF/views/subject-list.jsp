<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/10/2026
  Time: 2:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Subjects</title>
</head>
<body>

<h1>All Subjects</h1>

<ul>
  <c:forEach var="subject" items="${subjects}">
    ${subject}
  </c:forEach>
</ul>

<a href="${pageContext.request.contextPath}/sessions">Back to sessions</a>

</body>
</html>
