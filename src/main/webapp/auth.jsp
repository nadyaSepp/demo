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
    <title>Auth</title>
</head>
<body>

  <form action="auth" method="post">
    <div>
      <label for="email">Email:</label>
      <input type="email" name="email" id="email">
    </div>
    
    <div>
      <label for="password">Password:</label>
      <input type="password" name="password" id="password">
    </div>
    
    <div>
      <input type="submit" value="Auth">
    </div>
  </form>

  <p>
    Нет аккаунта?  <a href="register">Зарегистрироваться</a>
  </p>


</body>
</html>
