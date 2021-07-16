<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/7/2021
  Time: 8:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <nav >
        <div class="row container">
            <article class="col-sm-3">
                <a class="nav-link " href="/customer">View customer list</a>
                <a class="nav-link " href="/customer?action=create">Add new customer</a>
            </article>
            <article class="col-sm-9">
                <div class="tab-content">
                    <div class="container">
                        <h2>Product List</h2>
                        <table class="table table-hover" id="productTable">
                            <thead>
                            <tr>
                                <th>Id</th>
                                <th>Product Name</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>Color</th>
                                <th>Description</th>
                                <%--<th>Catalogue</th>--%>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${product}" var="product">
                            <tr>
                                <td>${product.getProductId()}</td>
                                <td>${product.getProductName()}</td>
                                <td>${product.getPrice()}</td>
                                <td>${product.getQuantity()}</td>
                                <td>${product.getColor()}</td>
                                <td>${product.getDescription()}</td>
                               <%-- <td>${product.getCatalogue().getCalatogueName()}</td>--%>
                                <td>
                                    <a href="/customer?action=edit&id=${product.getProductId()}">
                                        Edit
                                    </a>
                                </td>
                                <td>
                                    <a href="#myModal_${product.getProductId()}" role="button"
                                       class="btn btn-large btn-danger"
                                       data-toggle="modal">Delete</a>
                                </td>
                            </tr>
                            <div id="myModal_${product.getProductId()}" class="modal fade">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                                &times;
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <p>Are you sure you want to delete this ${product.getProductId()}?</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                            <a href="/customer?action=delete&id=${product.getProductId()}"
                                               role="button" class="btn btn-danger" title="Xoa">Delete</a>
                                        </div>
                                    </div>
                                </div>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </article>
        </div>
    </nav>
</div>
</body>
</html>
