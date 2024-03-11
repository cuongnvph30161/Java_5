<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<html class="container">
<form action="add-nhan-vien" method="post">
    <div class="mb-3">
        <label  class="form-label">Mã nhân viên</label>
        <input type="text" class="form-control" name="maSinhVien" value="${}" aria-describedby="emailHelp">
    </div>

    <div class="mb-3">
        <label  class="form-label">Họ Tên</label>
        <input type="text" class=" form-control"  name="hoTen">
    </div>
    <label  class="form-label">Giới tính</label>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="gioiTinh" id="flexRadioDefault1" value="Nam">
        <label class="form-check-label" for="flexRadioDefault1">
            Nam
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="gioiTinh" id="flexRadioDefault2" checked value="Nữ">
        <label class="form-check-label" for="flexRadioDefault2">
            Nữ
        </label>
    </div>

    <div class="mb-3">
        <label  class="form-label">Địa Chỉ</label>
        <input type="text" name="diaChi" class="form-control" >
    </div>

    <div class="mb-3">
        <label  class="form-label">Lương</label>
        <input type="text" name="luong" class="form-control" >
    </div>
    <div class="mb-3">
        <label  class="form-label">Phòng Ban</label>
        <select class="form-select" name="phongBan">
            <c:forEach var="i" items="${listPhongBan}">
                <option value="${i}">${i}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</html>