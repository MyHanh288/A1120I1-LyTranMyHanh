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
    <title>Add new product</title>
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
                <div class="tab-content">
                    <div class="container">
                        <form method="post" name="create" id="create_product">
                            <div class="form-group">
                                <label >Product Name</label>
                                <input type="text" name="productname" class="form-control"  id="productname" placeholder="ProductName">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Price</label>
                                <input type="text" name="price" class="form-control"  id="price" placeholder="Price">
                                <span class="form-message invalid">  </span>

                            </div>
                            <div class="form-group">
                                <label >Quantity</label>
                                <input type="text"  name="quantity" class="form-control" id="quantity"  placeholder="Quantity">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Color</label>
                                <input type="text"  name="color" class="form-control"  id="color" placeholder="Color">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Description</label>
                                <input type="text"  name="description" class="form-control" id="description"  placeholder="Description">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Catalogue</label>
                                <select name="catalogueid" id="catalogueid">
                                    <option>
                                        Catalogue
                                    </option>
                                    <c:forEach items="${catalogues}" var="catalogues">
                                        <option  value="${catalogues.getCatalogueId()}">
                                                ${catalogues.getCatalogueName()}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                            <button type="submit" name="submit" class="btn btn-primary">Create</button>
                            <button type="submit" name="submit" class="btn btn-primary">Back</button>
                        </form>
                    </div>
                </div>
        </div>
    </nav>
</div>
</body>
</html>
