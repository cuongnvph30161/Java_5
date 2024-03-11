<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">


<h2>Thong tin sinh vien</h2>
<form action="/addNew" method="post">
    <div class="mb-3">
        <label for="" class="form-label">Mã sinh viên</label>
        <input type="text" class="form-control" name="maSinhVien" id="" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
        <label for="" class="form-label">Họ tên</label>
        <input type="text" name="hoTen" class="form-control" >
    </div>
    <div class="mb-3">
        <label for="" class="form-label">Địa chỉ</label>
        <input type="text" name="diaChi" class="form-control" >
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="gioiTinh" value="Nam" id="flexRadioDefault1">
        <label class="form-check-label" for="flexRadioDefault1" >
            Nam
        </label>
    </div>

    <div class="form-check">
        <input class="form-check-input" type="radio" name="gioiTinh" value="Nữ" id="flexRadioDefault2" checked>
        <label class="form-check-label" for="flexRadioDefault2" >
            Nữ
        </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>

</form>


<table class="table" >
    <thead>
    <tr>
        <th scope="col">Mã</th>
        <th scope="col">Họ Tên</th>
        <th scope="col">Địa Chỉ</th>
        <th scope="col">Giới Tính</th>
        <th scope="col">Action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="sv">
        <tr>
            <td>${sv.maSinhVien}</td>
            <td>${sv.hoTen}</td>
            <td>${sv.diaChi}</td>
            <td>${sv.gioiTinh}</td>
            <td>
                <a href="/detail?id=${sv.maSinhVien}" class="btn btn-primary" role="button" data-bs-toggle="button">Detail</a>
                <a href="/delete?id=${sv.maSinhVien}" class="btn btn-danger" role="button" data-bs-toggle="button">Delete</a>

            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

