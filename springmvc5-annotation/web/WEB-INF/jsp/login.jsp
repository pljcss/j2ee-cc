<%--
  Created by IntelliJ IDEA.
  User: saicao
  Date: 2021/2/8
  Time: 6:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>登录页面</h1>
<form action="/user/login" method="post">
    用户名<input type="text" name="username"><br>
    密码<input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
