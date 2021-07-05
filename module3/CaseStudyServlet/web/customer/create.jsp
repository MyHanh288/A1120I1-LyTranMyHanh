<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/5/2021
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add new customer</title>
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
                        <form method="post" name="create" id="create_customer">
                            <div class="form-group">
                                <label >Customer Id</label>
                                <input type="text" name="customerId" class="form-control"  id="customerId" placeholder="CustomerId">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Customer Name:</label>
                                <input type="text" name="customerName" class="form-control"  id="customerName" placeholder="CustomerName">
                                <span class="form-message invalid">  </span>

                            </div>
                            <div class="form-group">
                                <label >Birthday:</label>
                                <input type="text"  name="customerBir" class="form-control" id="customerBir"  placeholder="Birthday">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Gender:</label>
                                <input type="text"  name="gender" class="form-control"  id="gender" placeholder="gender">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Id Number:</label>
                                <input type="text"  name="cusIdNum" class="form-control" id="cusIdNum"  placeholder="xxxxxxxxx">
                                <span class="form-message invalid">  </span>
                            </div>

                            <div class="form-group">
                                <label >Telephone Number</label>
                                <input type="text"  name="cusTelNum" class="form-control" id="cusTelNum"  placeholder="090-xxx-xxxx">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Email:</label>
                                <input type="text"  name="cusEmail" class="form-control"  id="cusEmail" placeholder="abc@gmail.com">
                                <span class="form-message invalid">  </span>
                            </div>
                            <div class="form-group">
                                <label >Customer Type</label>
                                <select name="customerTypeId" id="customerTypeId">
                                    <option>
                                        Customer Type
                                    </option>
                                    <c:forEach items="${customerTypes}" var="customerTypes">
                                        <option  value="${customerTypes.getcustomerTypeId()}">
                                                ${customerTypes.getcustomerTypeName()}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label >Address:</label>
                                <input type="text"  name="address" class="form-control"  id="address" placeholder="Address">
                                <span class="form-message invalid">  </span>
                            </div>

                            <button type="submit" name="submit" class="btn btn-primary">Add</button>
                        </form>
                    </div>
                </div>
            </article>
        </div>
    </nav>
</div>
</body>
</html>
