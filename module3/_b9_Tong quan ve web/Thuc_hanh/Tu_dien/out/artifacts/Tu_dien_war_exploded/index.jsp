<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/2/2021
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form action="/translate" method="post">
    <input type="text" name="search" placeholder="Enter your word:" >
    <input type="submit" id="submit" value="Search">
  </form>
  </body>
</html>
