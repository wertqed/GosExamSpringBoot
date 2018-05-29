<%--
  Created by IntelliJ IDEA.
  User: VBelov
  Date: 29.05.2018
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>ApiTest</title>
</head>
<body>
<span>Список тестов</span>
<table>
    <jsp:useBean id="listTest" class="java.util.ArrayList" scope="request"/>
    <c:forEach var="item" items="${listTest}">
        <tr>
            <td>${item.getId()}</td>
            <td>${item.getName()}</td>
        </tr>
    </c:forEach>
</table>
<form method="POST" enctype="application/json" action="/test">
    ID:  <input type="text" name="id"><br />
   Name: <input type="text" name="name"><br />
    <br />
    <input type="submit" value="submit"> Press here to add test!
</form>
</body>
</html>
