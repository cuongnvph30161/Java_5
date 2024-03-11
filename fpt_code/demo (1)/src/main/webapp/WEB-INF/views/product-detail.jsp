<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body class="container">
<form action="/product/update/${product.id}" method="post">
    <div class="mb-3">
        <label class="form-label">Id: </label>
        <input type="hidden" class="form-control" name="id" value="${product.id}" >
    </div>
    <div class="mb-3">
        <label class="form-label">Name: </label>
        <input type="text" class="form-control" name="name" value="${product.name}">
    </div>
    <div class="mb-3">
        <label class="form-label">Images: </label>
        <input type="text" class="form-control" name="images" value="${product.images}">
    </div>
    <div class="mb-3">
        <label class="form-label">Available: </label>
        <input type="text" class="form-control" name="available" value="${product.available}">
    </div>
    <div class="mb-3">
        <label class="form-label">Price: </label>
        <input type="text" class="form-control" name="price" value="${product.price}">
    </div>
    <div class="mb-3">
        <label class="form-label">Create Date: </label>
        <input type="text" class="form-control" name="createDate" value="${product.createDate}">
    </div>

    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Categories</label>
        <select id="disabledSelect" class="form-select" name="categories">
            <c:forEach var="i" items="${categories}">
                <option value="${i.id}"
                        <c:if test="${product.categories == i.name}">selected</c:if>
                >${i.name}</option>
            </c:forEach>
        </select>
    </div>

    <button type="submit" class="btn btn-primary mt-2">Update</button>
</form>
</body>
</html>