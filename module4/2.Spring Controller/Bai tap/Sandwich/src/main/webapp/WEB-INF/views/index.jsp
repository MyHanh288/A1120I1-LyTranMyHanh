<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/18/2021
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich</title>
  </head>
  <body>
  <form action="/seasoning" method="post">
    <h3>Which seasoning do you want </h3>

    <input type="checkbox" name="seasoning" value="Lattuce"><label>Lattcuce</label>
    <br>

    <input type="checkbox" name="seasoning" value="Tomato"> <label>Tomato</label>
    <br>
    <input type="checkbox" name="seasoning" value="Mustard"><label>Mustard</label>
    <br>

    <input type="checkbox" name="vehicle" value="Sprouts"><label>Sprouts</label>
    <br>
    <input type="submit" name="submit" value="Save">
  </form>

  <h5>Seasoning : ${result}</h5>

  </body>
</html>
