<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h3>Cap nhat thong tin</h3>
    <form method="post" class="form-group">
        <label>Ma SP</label>
        <input type="text" name="id" value="${product.id}">
        <br>
        <label>Ten SP</label>
        <input type="text" name="name" value="${product.name}">
        <br>
        <label>Gia SP</label>
        <input type="text" name="price" value="${product.price}">
        <br>
        <label>Mo ta SP</label>
        <input type="text" name="description" value="${product.description}">
        <br>
        <label>Nha san xuat</label>
        <input type="text" name="producer" value="${product.producer}">
        <br>
        <label></label>
        <input type="submit" value="Cap nhat" class="btn btn-primary">

    </form>
</div>
</body>
</html>
