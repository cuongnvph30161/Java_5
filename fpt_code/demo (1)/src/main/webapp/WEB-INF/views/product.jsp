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
<form action="/product/addNew" method="post">
    <div class="mb-3">
        <label class="form-label">Name: </label>
        <input type="text" class="form-control" name="name">
    </div>
    <div class="mb-3">
        <label class="form-label">Images: </label>
        <input type="text" class="form-control" name="images">
    </div>
    <div class="mb-3">
        <label class="form-label">Available: </label>
        <input type="text" class="form-control" name="available">
    </div>
    <div class="mb-3">
        <label class="form-label">Price: </label>
        <input type="text" class="form-control" name="price">
    </div>
    <div class="mb-3">
        <label class="form-label">Create Date: </label>
        <input type="text" class="form-control" name="createDate">
    </div>

    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Category</label>
        <select id="disabledSelect" class="form-select" name="categories">
            <c:forEach var="i" items="${categories}">
                <option value="${i.id}">${i.name}</option>
            </c:forEach>
        </select>
    </div>

    <button type="submit" class="btn btn-primary mt-2">Submit</button>
</form>

<table class="table">
    <thead>
    <tr>
        <td>Id</td>
        <td>name</td>
        <td>image</td>
        <td>available</td>
        <td>price</td>
        <td>create date</td>
        <td>category id</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${products}">
        <tr>
            <td>${i.id}</td>
            <td>${i.name}</td>
            <td>${i.images}</td>
            <td>${i.price}</td>
            <td>${i.available}</td>
            <td>${i.createDate}</td>
            <td>${i.categories.name}</td>
            <td>
                <a href="/product/delete/${i.id}" class="btn btn-danger">Delete</a>
                <a href="/product/detail/${i.id}" class="btn btn-warning">Detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>