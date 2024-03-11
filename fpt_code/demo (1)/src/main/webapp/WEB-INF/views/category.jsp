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
<form action="/category/addNew" method="post">
    <div class="mb-3">
        <label class="form-label">Id: </label>
        <input type="text" class="form-control" name="id">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten: </label>
        <input type="text" class="form-control" name="name">
    </div>
    <button type="submit" class="btn btn-primary mt-2">Submit</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th>id</th>
        <th>Ten</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${categories}" varStatus="nv">
        <tr>
            <td>${i.id}</td>
            <td>${i.name}</td>
            <td><a href="/category/detail/${i.id}" class="btn btn-primary">Detail</a>
                <a href="/category/delete/${i.id}" class="btn btn-danger">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>