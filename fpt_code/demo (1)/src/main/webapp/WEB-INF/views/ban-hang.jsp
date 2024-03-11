<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body class="container">
<div class="row">
    <div class="col-7">
        <p>Danh sach hoa don</p>
        <table class="table">
            <thead>
            <tr>
                <td>Id</td>
                <td>account name</td>
                <td>create date</td>
                <td>address</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="i" items="${order}">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.accounts.userName}</td>
                    <td>${i.createDate}</td>
                    <td>${i.address}</td>
                    <td>
                        <a href="/ban-hang/detail/${i.id}" class="btn btn-primary">Chọn</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="col-5">
        <p>Tao hoa don</p>
        <form action="#" method="post">
            <div class="mb-3">
                <label class="form-label">Id</label>
                <input type="text" class="form-control" name="id" value="${oders.id}">
            </div>
            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" class="form-control" name="name" value="${oders.accounts.userName}">
            </div>
            <div class="mb-3">
                <label class="form-label">Tong tien</label>
                <input type="text" class="form-control" disabled name="tongTien" value="#">
            </div>
            <button type="submit" class="btn btn-primary">Add</button>
        </form>
    </div>
</div>
<p>Danh sach hoa don chi tiet</p>
<table class="table">
    <thead>
    <tr>
        <td>Id</td>
        <td>Product Id</td>
        <td>Price</td>
        <td>Quantity</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="orderDetail" items="${orderDetail}">
        <tr>
            <td>${orderDetail.id}</td>
            <td>${orderDetail.product.name}</td>
            <td>${orderDetail.price}</td>
            <td>${orderDetail.quantity}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>Danh sach san pham</p>
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
    <c:forEach var="products" items="${products}">
        <tr>
            <td>${products.id}</td>
            <td>${products.name}</td>
            <td>${products.images}</td>
            <td>${products.price}</td>
            <td>${products.available}</td>
            <td>${products.createDate}</td>
            <td>${products.categories.name}</td>
            <td>
                <a href="/ban-hang/mua/${products.id}" class="btn btn-primary">Mua</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>
</body>