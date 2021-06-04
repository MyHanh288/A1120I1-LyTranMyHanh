<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/2/2021
  Time: 8:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="/discount" method="post">
    <label>Product Description :</label>
    <input type="text" name="description" >
    </br>

    <label>List Price :</label>
    <input type="text" name="price" >
    </br>

    <label>Discount Percent :</label>
    <input type="text" name="discount" >
    </br>

    <input type="submit" value="Caculate discount">
  </form>
  </body>
</html>
