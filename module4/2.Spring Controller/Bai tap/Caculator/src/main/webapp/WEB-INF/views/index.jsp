<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/18/2021
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h1>Caculator</h1>
  <h3 style="color:red">${message}</h3>

  <form action="/caculator" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2">
    <input type="submit" name="calculate" value="addition">
    <input type="submit" name="calculate" value="subtraction">
    <input type="submit" name="calculate" value="multiplication">
    <input type="submit" name="calculate" value="division">
  </form>


    <h5>Result : ${result}</h5>


  </body>
</html>
