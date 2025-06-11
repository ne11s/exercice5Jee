<%@ page import="org.example.exercice5jee.models.Dog" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="dogs" type="java.util.ArrayList<org.example.exercice5jee.models.Dog>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th scope="col" >Nom</th>
                <th scope="col">Race</th>
                <th scope="col">Date d'anniversaire</th>
                <th scope="col">Action</th>
            </tr>
        </thead>
        <tbody>
            <% if (!dogs.isEmpty()) {%>
                <% for (Dog d: dogs) {%>
                    <tr>
                        <td><%= d.getName()%></td>
                        <td><%= d.getBreed() %></td>
                        <td><%= d.getBirthday() %></td>
                        <td><a href="dogForm/<%= d.getId()%>">voir plus</a></td>
                    </tr>
                <% } %>
            <% } else { %>
                <th>Vous n'avez aucun chats dans votre liste !!!!</th>
            <% } %>
            <form action="dogTabs" method="post">
                <th><input type="text" name="name" id="name"></th>
                <th><input type="text" name="breed" id="breed"></th>
                <th><input type="date" name="birthday" id="birthday"></th>
                <th><button>Ajouter</button></th>
            </form>

        </tbody>
    </table>
</body>
</html>
