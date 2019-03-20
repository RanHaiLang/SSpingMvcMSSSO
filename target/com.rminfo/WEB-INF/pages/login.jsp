<%--
  Created by IntelliJ IDEA.
  User: SeaRan
  Date: 2019/3/5
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body style="text-algin:center">

<h1 style="color:red">客户端1的登录界面</h1>
<form action=${requestScope.url} method="post">
    <input type="text" name="userName" >账号
    </br>
    <input type="password" name="userPassword" >密码
    </br>
    <input type="hidden" name="redirectUrl" value="http://localhost/SSO/SSOClient1">
    <button type="submit" >登录</button>
</form>

</body>
</html>
