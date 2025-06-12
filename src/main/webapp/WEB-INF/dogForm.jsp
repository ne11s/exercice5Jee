<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="dog" type="org.example.exercice5jee.models.Dog" scope="request" />

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%= dog.getName()%>
</body>
</html>
