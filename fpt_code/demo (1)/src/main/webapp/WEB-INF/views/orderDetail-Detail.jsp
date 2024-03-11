<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body class="container">
<form action="/order/update/${order.id}" method="post">
    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Categories</label>
        <select id="disabledSelect" class="form-select" name="accounts">
            <c:forEach var="i" items="${listOrders}">
                <option value="${i.id}"
                        <c:if test="${orderDetail.orders == i.accounts.userName}">selected</c:if>
                >${i.accounts.name}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label for="disabledSelect1" class="form-label">Categories</label>
        <select id="disabledSelect1" class="form-select" name="accounts">
            <c:forEach var="i" items="${listProduct}">
                <option value="${i.id}"
                        <c:if test="${orderDetail.products == i.name}">selected</c:if>
                >${i.name}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Price: </label>
        <input type="text" class="form-control" name="price" value="${orderDetail.price}">
    </div>
    <div class="mb-3">
        <label class="form-label">Quantity: </label>
        <input type="text" class="form-control" name="quantity" value="${orderDetai.quantity}">
    </div>
    <button type="submit" class="btn btn-primary mt-2">Submit</button>
</form>
</body>
</html>