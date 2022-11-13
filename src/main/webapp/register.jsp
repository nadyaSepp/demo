<%--
  Created by IntelliJ IDEA.
  User: Илья
  Date: 13.11.2022
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

    <form action="register" method="post">
        <div>
            <label for="email">Email:</label>
            <input type="email" name="email" id="email">
        </div>

        <div>
            <label for="password">Password:</label>
            <input type="password" name="password" id="password">
        </div>

        <div>
            <input type="submit" value="Register">
        </div>
    </form>

    <p>
        Уже есть аккаунт? <a href="auth">Войти</a>
    </p>

</body>
</html>
