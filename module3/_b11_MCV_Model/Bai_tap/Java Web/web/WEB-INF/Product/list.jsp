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
    <h3>Danh sach san pham</h3>
    <a href="/?action=create">
        <button class="btn btn-primary">Them moi</button>
    </a>
    <div>
        <p>Tim kiem san pham</p>
        <form action="/?action=find" method="post">
            <input type="text" name="find">
            <input type="submit" value="Tim kiem" >
        </form>
    </div>
    <c:if test="${empty product}">
        <table class="table">
            <tr>
                <th>Ma SP</th>
                <th>Ten SP</th>
                <th>Gia SP</th>
                <th>Mo ta SP</th>
                <th>Nha san xuat</th>
                <th>Sua</th>
                <th>Xoa</th>
            </tr>

            <c:forEach items="${productList}" var="productlist">
                <tr>
                    <td>${productlist.id}</td>
                    <td>${productlist.name}</td>
                    <td>${productlist.price}</td>
                    <td>${productlist.description}</td>
                    <td>${productlist.producer}</td>
                    <td><a href="/?action=update&id=${productlist.id}"><button class="btn btn-warning">Sua</button></a></td>
                    <td><a href="/?action=delete&id=${productlist.id}"><button class="btn btn-danger">Xoa</button></a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

    <c:if test="${not empty product}">
        <table class="table">
            <tr>
                <th>Ma SP</th>
                <th>Ten SP</th>
                <th>Gia SP</th>
                <th>Mo ta SP</th>
                <th>Nha san xuat</th>
                <th>Sua</th>
                <th>Xoa</th>
            </tr>


            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${productlist.description}</td>
                <td>${productlist.producer}</td>
                <td><a href="/?action=update&id=${product.id}"><button class="btn btn-warning">Sua</button></a></td>
                <td><a href="/?action=delete&id=${product.id}"><button class="btn btn-danger">Xoa</button></a></td>
            </tr>

        </table>
    </c:if>


</div>
</body>
</html>
