<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/10/2026
  Time: 2:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Add Session</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/sessions/save">
    <label for="subjectId">Subject ID:</label>
    <input type="number" id="subjectId" name="subjectId" min="1" required>
    <br><br>

    <label for="minutes">Minutes:</label>
    <input type="number" id="minutes" name="minutes" min="1" required>
    <br><br>

    <label for="notes">Notes:</label>
    <textarea id="notes" name="notes" required></textarea>
    <br><br>

    <button type="submit">Save Session</button>
</form>

<a href="${pageContext.request.contextPath}/sessions">Back to sessions</a>
</body>
</html>
