<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022-03-29
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Exquisite pagodas</title>
  </head>
  <body>
  <div>
    <form action="${pageContext.request.contextPath }/HolleWorldServlet?action=login" method="post">
      用户名:<input type="text" name="userName"><br><br>
      密码:<input type="password" name="userPassword"><br><br>
      <input type="submit" value="登录">
    </form>
  </div>
  </body>
</html>
