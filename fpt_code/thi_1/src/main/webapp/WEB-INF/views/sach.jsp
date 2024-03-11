<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<html class="container">
<h1>Quản lí sách</h1>
<form action="add-sach" method="POST">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Id</label>
        <input type="text" name="id" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>

    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Tên</label>
        <input type="text" name="ten" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="mb-3">
        <label class="form-label">Loại</label>
        <select class="form-select" name="loai">
            <c:forEach var="i" items="${listLoaiSach}">
                <option value="${i}">${i}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Tác giả</label>
        <input type="text" name="tacgia" class="form-control">
    </div>
    <div class="mb-3">
        <label class="form-label">Giá</label>
        <input type="text" name="gia" class="form-control">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Tên</th>
        <th scope="col">Loại</th>
        <th scope="col">Tác giả</th>
        <th scope="col">Giá</th>
        <th scope="col">Chức năng</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sach}" var="s">
        <tr>
            <th scope="row">${s.id}</th>
            <td>${s.ten}</td>
            <td>${s.loai}</td>
            <td>${s.tacGia}</td>
            <td>${s.gia}</td>

            <td>
                <a href="/delete-sach?id=${s.id}" class="btn btn-primary" role="button"
                   data-bs-toggle="button">Remove</a>
                <a href="/detail-sach?id=${s.id}" class="btn btn-primary" role="button"
                   data-bs-toggle="button">Detail</a>
            </td>


        </tr>
    </c:forEach>

    </tbody>
</table>
</html>
