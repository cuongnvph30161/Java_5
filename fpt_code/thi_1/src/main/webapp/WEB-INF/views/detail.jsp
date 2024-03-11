<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<html class="container">

<h1>Quản lí sách</h1>

<form action="update-sach" method="POST">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Id</label>
        <input type="text" value="${sach.id}" name="id" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>

    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Tên</label>
        <input type="text" value="${sach.ten}" name="ten" class="form-control" id="exampleInputPassword1">
    </div>

    <div class="mb-3">
        <label class="form-label">Loại</label>
        <select  class="form-select" name="loai">
            <c:forEach var="i" items="${listLoai}">
                <option value="${i}">${i}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Tác giả</label>
        <input type="text" value="${sach.tacGia}" name="tacgia" class="form-control">
    </div>

    <div class="mb-3">
        <label class="form-label">Giá</label>
        <input type="text" value="${sach.gia}" name="gia" class="form-control">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>