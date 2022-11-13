<%--
  Created by IntelliJ IDEA.
  User: Илья
  Date: 12.11.2022
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add recipe</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <c:import url="header.html"/>

    <p>
        User:
        <%= session.getAttribute("user")%>
    </p>

    <form action="create-recipe" method="post">
        <div>
            <label for="title">Название рецепта</label>
            <input type="text" name="title" id="title">
        </div>
        
        <div>
            <label for="description">Рецепт</label>
            <textarea name="description" id="description" cols="30" rows="10"></textarea>
        </div>
        
        <div>
            <input type="submit" value="Добавить рецепт">
        </div>
    </form>
</body>
</html>
