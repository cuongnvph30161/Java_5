<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body class="container">
<form action="/order-detail/addNew" method="post">
    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Category</label>
        <select id="disabledSelect" class="form-select" name="order">
            <c:forEach var="i" items="${listOrders}">
                <option value="${i.id}">${i.accounts.userName}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label for="disabledSelect1" class="form-label">Product</label>
        <select id="disabledSelect1" class="form-select" name="product">
            <c:forEach var="i" items="${listProduct}">
                <option value="${i.id}">${i.name}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Price: </label>
        <input type="text" class="form-control" name="price">
    </div>
    <div class="mb-3">
        <label class="form-label">Quantity: </label>
        <input type="text" class="form-control" name="quantity">
    </div>

    <button type="submit" class="btn btn-primary mt-2">Submit</button>
</form>

<table class="table">
    <thead>
    <tr>
        <td>Id</td>
        <td>Oder Id</td>
        <td>Product Id</td>
        <td>Price</td>
        <td>Quantity</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${listOrderDetail}">
        <tr>
            <td>${i.id}</td>
            <td>${i.orders.accounts.userName}</td>
            <td>${i.product.name}</td>
            <td>${i.price}</td>
            <td>${i.quantity}</td>
            <td>
                <a href="/order-detail/detail${i.id}" class="btn btn-danger">Delete</a>
                <a href="/order-detail/delete${i.id}" class="btn btn-warning">Detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>