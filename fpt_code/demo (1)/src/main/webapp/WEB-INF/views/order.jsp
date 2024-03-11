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
<form action="/order/addNew" method="post">
    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Account</label>
        <select id="disabledSelect" class="form-select" name="account">
            <c:forEach var="i" items="${account}">
                <option value="${i.userName}">${i.userName}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Create date: </label>
        <input type="date" class="form-control" name="createDate">
    </div>
    <div class="mb-3">
        <label class="form-label">Address: </label>
        <input type="text" class="form-control" name="address">
    </div>
    <button type="submit" class="btn btn-primary mt-2">Submit</button>
</form>

<table class="table">
    <thead>
    <tr>
        <td>Id</td>
        <td>Account Name</td>
        <td>Create Date</td>
        <td>Address</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${listOrder}">
        <tr>
            <td>${i.id}</td>
            <td>${i.accounts.userName}</td>
            <td><fmt:formatDate value="${i.createDate}" pattern="dd-MM-yyyy"></fmt:formatDate></td>
            <td>${i.address}</td>
            <td>
                <a href="/order/delete/${i.id}" class="btn btn-danger">Delete</a>
                <a href="/order/detail/${i.id}" class="btn btn-warning">Detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>