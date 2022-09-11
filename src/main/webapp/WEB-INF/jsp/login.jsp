<%--
  Created by IntelliJ IDEA.
  User: hrp
  Date: 2022/9/11
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<br><br><br>
<h2>登录</h2>
<form action="${pageContext.request.contextPath}/login">
    姓名:<input name="name"><br>
    密码:<input type="password" name="pwd"><br>
    <input type="submit" value="登录">
</form><br><br>
${msg}
</body>
</html>
