<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">


<h2>Thong tin sinh vien</h2>
<form action="/update" method="post">

    <div class="mb-3">
        <label for="" class="form-label">Mã sinh viên</label>
        <input type="text" class="form-control" name="maSinhVien" id="" aria-describedby="emailHelp" value="${sinhVien.maSinhVien}">
    </div>
    <div class="mb-3">
        <label for="" class="form-label">Họ tên</label>
        <input type="text" name="hoTen" class="form-control" value="${sinhVien.hoTen}">
    </div>

    <div class="mb-3">
        <label for="" class="form-label">Địa chỉ</label>
        <input type="text" name="diaChi" value="${sinhVien.diaChi}"  class="form-control" >
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio"
        ${sinhVien.gioiTinh=='Nam'?'checked':''}
               name="gioiTinh" value="Nam">

        <label class="form-check-label" >
            Nam
        </label>
    </div>

    <div class="form-check">
        <input class="form-check-input" type="radio"
        ${sinhVien.gioiTinh=='Nữ'?'checked':''}
               name="gioiTinh" value="Nữ">
        <label class="form-check-label" >
            Nữ
        </label>
    </div>
    <button type="submit" class="btn btn-primary">Update</button>

</form>


<%--<table class="table" >--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <th scope="col">Mã</th>--%>
<%--        <th scope="col">Họ Tên</th>--%>
<%--        <th scope="col">Địa Chỉ</th>--%>
<%--        <th scope="col">Giới Tính</th>--%>
<%--        <th scope="col">Action</th>--%>

<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach items="${listSinhVien}" var="sv">--%>
<%--        <tr>--%>
<%--            <td>${sv.maSinhVien}</td>--%>
<%--            <td>${sv.hoTen}</td>--%>
<%--            <td>${sv.diaChi}</td>--%>
<%--            <td>${sv.gioiTinh}</td>--%>
<%--            <td>--%>
<%--                <a  class="btn btn-primary" role="button" data-bs-toggle="button">Details</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>

