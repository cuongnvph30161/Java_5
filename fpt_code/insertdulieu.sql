-- Thêm dữ liệu cho bảng HangKhachHang
INSERT INTO HangKhachHang (TenHang, MoTa, DiemToiThieu, TrangThai)
VALUES
('Hàng 1', 'Mô tả hàng 1', 10, 1),
('Hàng 2', 'Mô tả hàng 2', 15, 1),
('Hàng 3', 'Mô tả hàng 3', 20, 0),
('Hàng 4', 'Mô tả hàng 4', 25, 1),
('Hàng 5', 'Mô tả hàng 5', 30, 0),
('Hàng 6', 'Mô tả hàng 6', 35, 1),
('Hàng 7', 'Mô tả hàng 7', 40, 0),
('Hàng 8', 'Mô tả hàng 8', 45, 1),
('Hàng 9', 'Mô tả hàng 9', 50, 0),
('Hàng 10', 'Mô tả hàng 10', 55, 1),
('Hàng 11', 'Mô tả hàng 11', 60, 0),
('Hàng 12', 'Mô tả hàng 12', 65, 1),
('Hàng 13', 'Mô tả hàng 13', 70, 0),
('Hàng 14', 'Mô tả hàng 14', 75, 1),
('Hàng 15', 'Mô tả hàng 15', 80, 0),
('Hàng 16', 'Mô tả hàng 16', 85, 1),
('Hàng 17', 'Mô tả hàng 17', 90, 0),
('Hàng 18', 'Mô tả hàng 18', 95, 1),
('Hàng 19', 'Mô tả hàng 19', 100, 0),
('Hàng 20', 'Mô tả hàng 20', 105, 1);

-- Thêm dữ liệu cho bảng KhachHang
INSERT INTO KhachHang (TenKhachHang, SinhNhat, DiaChi, SoDienThoai, Email, GioiTinh, ChungMinhThu, SoCanCuoc, AnhDaiDien, TrangThai, DiemTichLuy, HangKhachHang, NguoiGioiThieu)
VALUES
('Khách hàng 1', '1990-01-01', 'Địa chỉ 1', '0123456789', 'email1@example.com', 1, '123456789', '123456', 'anh1.jpg', 1, 0, 1, NULL),
('Khách hàng 2', '1985-05-15', 'Địa chỉ 2', '0987654321', 'email2@example.com', 0, '789012345', '789012', 'anh2.jpg', 1, 0, 2, NULL),
('Khách hàng 3', '1992-03-20', 'Địa chỉ 3', '0345678901', 'email3@example.com', 1, '345678901', '345678', 'anh3.jpg', 0, 0, 3, 1),
('Khách hàng 4', '1988-12-10', 'Địa chỉ 4', '0765432109', 'email4@example.com', 0, '901234567', '901234', 'anh4.jpg', 1, 0, 1, 2),
('Khách hàng 5', '1995-07-05', 'Địa chỉ 5', '0234567890', 'email5@example.com', 1, '567890123', '567890', 'anh5.jpg', 0, 0, 2, 3),
('Khách hàng 6', '1998-09-30', 'Địa chỉ 6', '0890123456', 'email6@example.com', 0, '234567890', '234567', 'anh6.jpg', 1, 0, 3, 4),
('Khách hàng 7', '1987-06-25', 'Địa chỉ 7', '0456789012', 'email7@example.com', 1, '890123456', '890123', 'anh7.jpg', 1, 0, 1, 5),
('Khách hàng 8', '1993-11-15', 'Địa chỉ 8', '0678901234', 'email8@example.com', 0, '456789012', '456789', 'anh8.jpg', 0, 0, 2, 6),
('Khách hàng 9', '1991-02-18', 'Địa chỉ 9', '0567890123', 'email9@example.com', 1, '123456789', '123456', 'anh9.jpg', 1, 0, 3, 7),
('Khách hàng 10', '1996-04-08', 'Địa chỉ 10', '0789012345', 'email10@example.com', 0, '678901234', '678901', 'anh10.jpg', 0, 0, 1, 8),
('Khách hàng 11', '1994-08-21', 'Địa chỉ 11', '0234567890', 'email11@example.com', 1, '234567890', '234567', 'anh11.jpg', 1, 0, 2, 9),
('Khách hàng 12', '1989-10-11', 'Địa chỉ 12', '0456789012', 'email12@example.com', 0, '890123456', '890123', 'anh12.jpg', 1, 0, 3, 10),
('Khách hàng 13', '1997-12-03', 'Địa chỉ 13', '0567890123', 'email13@example.com', 1, '123456789', '123456', 'anh13.jpg', 0, 0, 1, 11),
('Khách hàng 14', '1990-05-28', 'Địa chỉ 14', '0789012345', 'email14@example.com', 0, '678901234', '678901', 'anh14.jpg', 1, 0, 2, 12),
('Khách hàng 15', '1992-09-16', 'Địa chỉ 15', '0345678901', 'email15@example.com', 1, '345678901', '345678', 'anh15.jpg', 0, 0, 3, 13),
('Khách hàng 16', '1986-07-20', 'Địa chỉ 16', '0987654321', 'email16@example.com', 0, '789012345', '789012', 'anh16.jpg', 1, 0, 1, 14),
('Khách hàng 17', '1991-01-25', 'Địa chỉ 17', '0123456789', 'email17@example.com', 1, '123456789', '123456', 'anh17.jpg', 1, 0, 2, 15),
('Khách hàng 18', '1998-03-13', 'Địa chỉ 18', '0765432109', 'email18@example.com', 0, '901234567', '901234', 'anh18.jpg', 0, 0, 3, 16),
('Khách hàng 19', '1988-11-05', 'Địa chỉ 19', '0234567890', 'email19@example.com', 1, '567890123', '567890', 'anh19.jpg', 1, 0, 1, 17),
('Khách hàng 20', '1995-06-23', 'Địa chỉ 20', '0890123456', 'email20@example.com', 0, '234567890', '234567', 'anh20.jpg', 0, 0, 2, 18);

-- Thêm dữ liệu cho bảng PhieuGiamGia
INSERT INTO PhieuGiamGia (MaPhieu, TenPhieu, NgayBatDau, NgayKetThuc, GiaTriGiam, GiaTriGiamToiDa, HinhThucGiam, TrangThai, NguoiSoHuu)
VALUES
('PGG001', 'Phiếu giảm giá 1', '2024-01-01', '2024-02-01', 10, 100, 1, 1, 1),
('PGG002', 'Phiếu giảm giá 2', '2024-02-02', '2024-03-02', 15, 150, 0, 1, 2),
('PGG003', 'Phiếu giảm giá 3', '2024-03-03', '2024-04-03', 20, 200, 1, 0, 3),
('PGG004', 'Phiếu giảm giá 4', '2024-04-04', '2024-05-04', 25, 250, 0, 1, 4),
('PGG005', 'Phiếu giảm giá 5', '2024-05-05', '2024-06-05', 30, 300, 1, 0, 5),
('PGG006', 'Phiếu giảm giá 6', '2024-06-06', '2024-07-06', 35, 350, 0, 1, 6),
('PGG007', 'Phiếu giảm giá 7', '2024-07-07', '2024-08-07', 40, 400, 1, 1, 7),
('PGG008', 'Phiếu giảm giá 8', '2024-08-08', '2024-09-08', 45, 450, 0, 0, 8),
('PGG009', 'Phiếu giảm giá 9', '2024-09-09', '2024-10-09', 50, 500, 1, 1, 9),
('PGG010', 'Phiếu giảm giá 10', '2024-10-10', '2024-11-10', 55, 550, 0, 0, 10),
('PGG011', 'Phiếu giảm giá 11', '2024-11-11', '2024-12-11', 60, 600, 1, 1, 11),
('PGG012', 'Phiếu giảm giá 12', '2024-12-12', '2025-01-12', 65, 650, 0, 1, 12),
('PGG013', 'Phiếu giảm giá 13', '2025-01-13', '2025-02-13', 70, 700, 1, 0, 13),
('PGG014', 'Phiếu giảm giá 14', '2025-02-14', '2025-03-14', 75, 750, 0, 1, 14),
('PGG015', 'Phiếu giảm giá 15', '2025-03-15', '2025-04-15', 80, 800, 1, 1, 15),
('PGG016', 'Phiếu giảm giá 16', '2025-04-16', '2025-05-16', 85, 850, 0, 0, 16),
('PGG017', 'Phiếu giảm giá 17', '2025-05-17', '2025-06-17', 90, 900, 1, 1, 17),
('PGG018', 'Phiếu giảm giá 18', '2025-06-18', '2025-07-18', 95, 950, 0, 0, 18),
('PGG019', 'Phiếu giảm giá 19', '2025-07-19', '2025-08-19', 100, 1000, 1, 1, 19),
('PGG020', 'Phiếu giảm giá 20', '2025-08-20', '2025-09-20', 105, 1050, 0, 1, 20);

-- Thêm dữ liệu cho bảng TheThanhVien
INSERT INTO TheThanhVien (MaThe, MauThe, LoaiThe, NgayPhatHanh, NgayHuy, TrangThai, NguoiSoHuu)
VALUES
('TTV001', 'Mau1', 'Loai1', '2024-01-01', '2024-01-05', 1, 1),
('TTV002', 'Mau2', 'Loai2', '2024-02-01', '2024-02-05', 1, 2),
('TTV003', 'Mau3', 'Loai3', '2024-03-01', '2024-03-05', 0, 3),
('TTV004', 'Mau4', 'Loai4', '2024-04-01', '2024-04-05', 1, 4),
('TTV005', 'Mau5', 'Loai5', '2024-05-01', '2024-05-05', 0, 5),
('TTV006', 'Mau6', 'Loai6', '2024-06-01', '2024-06-05', 1, 6),
('TTV007', 'Mau7', 'Loai7', '2024-07-01', '2024-07-05', 1, 7),
('TTV008', 'Mau8', 'Loai8', '2024-08-01', '2024-08-05', 0, 8),
('TTV009', 'Mau9', 'Loai9', '2024-09-01', '2024-09-05', 1, 9),
('TTV010', 'Mau10', 'Loai10', '2024-10-01', '2024-10-05', 0, 10),
('TTV011', 'Mau11', 'Loai11', '2024-11-01', '2024-11-05', 1, 11),
('TTV012', 'Mau12', 'Loai12', '2024-12-01', '2024-12-05', 1, 12),
('TTV013', 'Mau13', 'Loai13', '2025-01-01', '2025-01-05', 0, 13),
('TTV014', 'Mau14', 'Loai14', '2025-02-01', '2025-02-05', 1, 14),
('TTV015', 'Mau15', 'Loai15', '2025-03-01', '2025-03-05', 1, 15),
('TTV016', 'Mau16', 'Loai16', '2025-04-01', '2025-04-05', 0, 16),
('TTV017', 'Mau17', 'Loai17', '2025-05-01', '2025-05-05', 1, 17),
('TTV018', 'Mau18', 'Loai18', '2025-06-01', '2025-06-05', 0, 18),
('TTV019', 'Mau19', 'Loai19', '2025-07-01', '2025-07-05', 1, 19),
('TTV020', 'Mau20', 'Loai20', '2025-08-01', '2025-08-05', 1, 20);

-- Thêm dữ liệu cho bảng HoaDon
INSERT INTO HoaDon (NgayLap, NguoiLap, GhiChu, NgayThanhToan, TrangThai, NguoiMua)
VALUES
('2024-01-01', 'Nhân viên 1', 'Ghi chú hóa đơn 1', '2024-01-05', 1, 1),
('2024-02-01', 'Nhân viên 2', 'Ghi chú hóa đơn 2', '2024-02-05', 1, 2),
('2024-03-01', 'Nhân viên 3', 'Ghi chú hóa đơn 3', '2024-03-05', 0, 3),
('2024-04-01', 'Nhân viên 4', 'Ghi chú hóa đơn 4', '2024-04-05', 1, 4),
('2024-05-01', 'Nhân viên 5', 'Ghi chú hóa đơn 5', '2024-05-05', 0, 5),
('2024-06-01', 'Nhân viên 6', 'Ghi chú hóa đơn 6', '2024-06-05', 1, 6),
('2024-07-01', 'Nhân viên 7', 'Ghi chú hóa đơn 7', '2024-07-05', 1, 7),
('2024-08-01', 'Nhân viên 8', 'Ghi chú hóa đơn 8', '2024-08-05', 0, 8),
('2024-09-01', 'Nhân viên 9', 'Ghi chú hóa đơn 9', '2024-09-05', 1, 9),
('2024-10-01', 'Nhân viên 10', 'Ghi chú hóa đơn 10', '2024-10-05', 0, 10),
('2024-11-01', 'Nhân viên 11', 'Ghi chú hóa đơn 11', '2024-11-05', 1, 11),
('2024-12-01', 'Nhân viên 12', 'Ghi chú hóa đơn 12', '2024-12-05', 1, 12),
('2025-01-01', 'Nhân viên 13', 'Ghi chú hóa đơn 13', '2025-01-05', 0, 13),
('2025-02-01', 'Nhân viên 14', 'Ghi chú hóa đơn 14', '2025-02-05', 1, 14),
('2025-03-01', 'Nhân viên 15', 'Ghi chú hóa đơn 15', '2025-03-05', 1, 15),
('2025-04-01', 'Nhân viên 16', 'Ghi chú hóa đơn 16', '2025-04-05', 0, 16),
('2025-05-01', 'Nhân viên 17', 'Ghi chú hóa đơn 17', '2025-05-05', 1, 17),
('2025-06-01', 'Nhân viên 18', 'Ghi chú hóa đơn 18', '2025-06-05', 0, 18),
('2025-07-01', 'Nhân viên 19', 'Ghi chú hóa đơn 19', '2025-07-05', 1, 19),
('2025-08-01', 'Nhân viên 20', 'Ghi chú hóa đơn 20', '2025-08-05', 1, 20);

-- Thêm dữ liệu cho bảng DiaChi
INSERT INTO DiaChi (TenDiaChi, MoTaChiTiet, TinhThanhPho, QuanHuyen, PhuongXa, DuongPho, KhachHang)
VALUES
('Địa chỉ 1', 'Mô tả chi tiết 1', 'TinhThanhPho 1', 'QuanHuyen 1', 'PhuongXa 1', 'DuongPho 1', 1),
('Địa chỉ 2', 'Mô tả chi tiết 2', 'TinhThanhPho 2', 'QuanHuyen 2', 'PhuongXa 2', 'DuongPho 2', 2),
('Địa chỉ 3', 'Mô tả chi tiết 3', 'TinhThanhPho 3', 'QuanHuyen 3', 'PhuongXa 3', 'DuongPho 3', 3),
('Địa chỉ 4', 'Mô tả chi tiết 4', 'TinhThanhPho 4', 'QuanHuyen 4', 'PhuongXa 4', 'DuongPho 4', 4),
('Địa chỉ 5', 'Mô tả chi tiết 5', 'TinhThanhPho 5', 'QuanHuyen 5', 'PhuongXa 5', 'DuongPho 5', 5),
('Địa chỉ 6', 'Mô tả chi tiết 6', 'TinhThanhPho 6', 'QuanHuyen 6', 'PhuongXa 6', 'DuongPho 6', 6),
('Địa chỉ 7', 'Mô tả chi tiết 7', 'TinhThanhPho 7', 'QuanHuyen 7', 'PhuongXa 7', 'DuongPho 7', 7),
('Địa chỉ 8', 'Mô tả chi tiết 8', 'TinhThanhPho 8', 'QuanHuyen 8', 'PhuongXa 8', 'DuongPho 8', 8),
('Địa chỉ 9', 'Mô tả chi tiết 9', 'TinhThanhPho 9', 'QuanHuyen 9', 'PhuongXa 9', 'DuongPho 9', 9),
('Địa chỉ 10', 'Mô tả chi tiết 10', 'TinhThanhPho 10', 'QuanHuyen 10', 'PhuongXa 10', 'DuongPho 10', 10),
('Địa chỉ 11', 'Mô tả chi tiết 11', 'TinhThanhPho 11', 'QuanHuyen 11', 'PhuongXa 11', 'DuongPho 11', 11),
('Địa chỉ 12', 'Mô tả chi tiết 12', 'TinhThanhPho 12', 'QuanHuyen 12', 'PhuongXa 12', 'DuongPho 12', 12),
('Địa chỉ 13', 'Mô tả chi tiết 13', 'TinhThanhPho 13', 'QuanHuyen 13', 'PhuongXa 13', 'DuongPho 13', 13),
('Địa chỉ 14', 'Mô tả chi tiết 14', 'TinhThanhPho 14', 'QuanHuyen 14', 'PhuongXa 14', 'DuongPho 14', 14),
('Địa chỉ 15', 'Mô tả chi tiết 15', 'TinhThanhPho 15', 'QuanHuyen 15', 'PhuongXa 15', 'DuongPho 15', 15),
('Địa chỉ 16', 'Mô tả chi tiết 16', 'TinhThanhPho 16', 'QuanHuyen 16', 'PhuongXa 16', 'DuongPho 16', 16),
('Địa chỉ 17', 'Mô tả chi tiết 17', 'TinhThanhPho 17', 'QuanHuyen 17', 'PhuongXa 17', 'DuongPho 17', 17),
('Địa chỉ 18', 'Mô tả chi tiết 18', 'TinhThanhPho 18', 'QuanHuyen 18', 'PhuongXa 18', 'DuongPho 18', 18),
('Địa chỉ 19', 'Mô tả chi tiết 19', 'TinhThanhPho 19', 'QuanHuyen 19', 'PhuongXa 19', 'DuongPho 19', 19),
('Địa chỉ 20', 'Mô tả chi tiết 20', 'TinhThanhPho 20', 'QuanHuyen 20', 'PhuongXa 20', 'DuongPho 20', 20);

-- Thêm dữ liệu cho bảng GioHang
INSERT INTO GioHang (NgayTao, NgayCapNhap, NguoiSoHuu, GhiChu, TrangThai)
VALUES
('2024-01-01', '2024-01-05', 1, 'Ghi chú giỏ hàng 1', 1),
('2024-02-01', '2024-02-05', 2, 'Ghi chú giỏ hàng 2', 1),
('2024-03-01', '2024-03-05', 3, 'Ghi chú giỏ hàng 3', 0),
('2024-04-01', '2024-04-05', 4, 'Ghi chú giỏ hàng 4', 1),
('2024-05-01', '2024-05-05', 5, 'Ghi chú giỏ hàng 5', 0),
('2024-06-01', '2024-06-05', 6, 'Ghi chú giỏ hàng 6', 1),
('2024-07-01', '2024-07-05', 7, 'Ghi chú giỏ hàng 7', 1),
('2024-08-01', '2024-08-05', 8, 'Ghi chú giỏ hàng 8', 0),
('2024-09-01', '2024-09-05', 9, 'Ghi chú giỏ hàng 9', 1),
('2024-10-01', '2024-10-05', 10, 'Ghi chú giỏ hàng 10', 0),
('2024-11-01', '2024-11-05', 11, 'Ghi chú giỏ hàng 11', 1),
('2024-12-01', '2024-12-05', 12, 'Ghi chú giỏ hàng 12', 1),
('2025-01-01', '2025-01-05', 13, 'Ghi chú giỏ hàng 13', 0),
('2025-02-01', '2025-02-05', 14, 'Ghi chú giỏ hàng 14', 1),
('2025-03-01', '2025-03-05', 15, 'Ghi chú giỏ hàng 15', 1),
('2025-04-01', '2025-04-05', 16, 'Ghi chú giỏ hàng 16', 0),
('2025-05-01', '2025-05-05', 17, 'Ghi chú giỏ hàng 17', 1),
('2025-06-01', '2025-06-05', 18, 'Ghi chú giỏ hàng 18', 0),
('2025-07-01', '2025-07-05', 19, 'Ghi chú giỏ hàng 19', 1),
('2025-08-01', '2025-08-05', 20, 'Ghi chú giỏ hàng 20', 1);

-- Thêm dữ liệu cho bảng DanhSachYeuThich
INSERT INTO DanhSachYeuThich (NgayTao, NgayCapNhap, NguoiSoHuu, GhiChu, TrangThai)
VALUES
('2024-01-01', '2024-01-05', 1, 'Ghi chú danh sách yêu thích 1', 1),
('2024-02-01', '2024-02-05', 2, 'Ghi chú danh sách yêu thích 2', 1),
('2024-03-01', '2024-03-05', 3, 'Ghi chú danh sách yêu thích 3', 0),
('2024-04-01', '2024-04-05', 4, 'Ghi chú danh sách yêu thích 4', 1),
('2024-05-01', '2024-05-05', 5, 'Ghi chú danh sách yêu thích 5', 0),
('2024-06-01', '2024-06-05', 6, 'Ghi chú danh sách yêu thích 6', 1),
('2024-07-01', '2024-07-05', 7, 'Ghi chú danh sách yêu thích 7', 1),
('2024-08-01', '2024-08-05', 8, 'Ghi chú danh sách yêu thích 8', 0),
('2024-09-01', '2024-09-05', 9, 'Ghi chú danh sách yêu thích 9', 1),
('2024-10-01', '2024-10-05', 10, 'Ghi chú danh sách yêu thích 10', 0),
('2024-11-01', '2024-11-05', 11, 'Ghi chú danh sách yêu thích 11', 1),
('2024-12-01', '2024-12-05', 12, 'Ghi chú danh sách yêu thích 12', 1),
('2025-01-01', '2025-01-05', 13, 'Ghi chú danh sách yêu thích 13', 0),
('2025-02-01', '2025-02-05', 14, 'Ghi chú danh sách yêu thích 14', 1),
('2025-03-01', '2025-03-05', 15, 'Ghi chú danh sách yêu thích 15', 1),
('2025-04-01', '2025-04-05', 16, 'Ghi chú danh sách yêu thích 16', 0),
('2025-05-01', '2025-05-05', 17, 'Ghi chú danh sách yêu thích 17', 1),
('2025-06-01', '2025-06-05', 18, 'Ghi chú danh sách yêu thích 18', 0),
('2025-07-01', '2025-07-05', 19, 'Ghi chú danh sách yêu thích 19', 1),
('2025-08-01', '2025-08-05', 20, 'Ghi chú danh sách yêu thích 20', 1);

-- Thêm dữ liệu cho bảng SanPham
INSERT INTO SanPham (TenSanPham, ChatLieu, GiaHienHanh, SoLuongTon, MoTa, LoaiSanPham, MauSac, NhaSanXuat, TrangThai)
VALUES
('Sản phẩm 1', 'Chất liệu 1', 500000, 100, 'Mô tả sản phẩm 1', 'Loại 1', 'Màu sắc 1', 'Nhà sản xuất 1', 1),
('Sản phẩm 2', 'Chất liệu 2', 700000, 150, 'Mô tả sản phẩm 2', 'Loại 2', 'Màu sắc 2', 'Nhà sản xuất 2', 1),
('Sản phẩm 3', 'Chất liệu 3', 900000, 80, 'Mô tả sản phẩm 3', 'Loại 3', 'Màu sắc 3', 'Nhà sản xuất 3', 0),
('Sản phẩm 4', 'Chất liệu 4', 1200000, 120, 'Mô tả sản phẩm 4', 'Loại 4', 'Màu sắc 4', 'Nhà sản xuất 4', 1),
('Sản phẩm 5', 'Chất liệu 5', 1500000, 200, 'Mô tả sản phẩm 5', 'Loại 5', 'Màu sắc 5', 'Nhà sản xuất 5', 0),
('Sản phẩm 6', 'Chất liệu 6', 800000, 90, 'Mô tả sản phẩm 6', 'Loại 6', 'Màu sắc 6', 'Nhà sản xuất 6', 1),
('Sản phẩm 7', 'Chất liệu 7', 1100000, 180, 'Mô tả sản phẩm 7', 'Loại 7', 'Màu sắc 7', 'Nhà sản xuất 7', 1),
('Sản phẩm 8', 'Chất liệu 8', 1300000, 70, 'Mô tả sản phẩm 8', 'Loại 8', 'Màu sắc 8', 'Nhà sản xuất 8', 0),
('Sản phẩm 9', 'Chất liệu 9', 950000, 110, 'Mô tả sản phẩm 9', 'Loại 9', 'Màu sắc 9', 'Nhà sản xuất 9', 1),
('Sản phẩm 10', 'Chất liệu 10', 1200000, 160, 'Mô tả sản phẩm 10', 'Loại 10', 'Màu sắc 10', 'Nhà sản xuất 10', 0),
('Sản phẩm 11', 'Chất liệu 11', 1600000, 80, 'Mô tả sản phẩm 11', 'Loại 11', 'Màu sắc 11', 'Nhà sản xuất 11', 1),
('Sản phẩm 12', 'Chất liệu 12', 1800000, 120, 'Mô tả sản phẩm 12', 'Loại 12', 'Màu sắc 12', 'Nhà sản xuất 12', 1),
('Sản phẩm 13', 'Chất liệu 13', 1000000, 60, 'Mô tả sản phẩm 13', 'Loại 13', 'Màu sắc 13', 'Nhà sản xuất 13', 0),
('Sản phẩm 14', 'Chất liệu 14', 1400000, 100, 'Mô tả sản phẩm 14', 'Loại 14', 'Màu sắc 14', 'Nhà sản xuất 14', 1),
('Sản phẩm 15', 'Chất liệu 15', 1700000, 150, 'Mô tả sản phẩm 15', 'Loại 15', 'Màu sắc 15', 'Nhà sản xuất 15', 1),
('Sản phẩm 16', 'Chất liệu 16', 900000, 70, 'Mô tả sản phẩm 16', 'Loại 16', 'Màu sắc 16', 'Nhà sản xuất 16', 0),
('Sản phẩm 17', 'Chất liệu 17', 1500000, 110, 'Mô tả sản phẩm 17', 'Loại 17', 'Màu sắc 17', 'Nhà sản xuất 17', 1),
('Sản phẩm 18', 'Chất liệu 18', 1100000, 140, 'Mô tả sản phẩm 18', 'Loại 18', 'Màu sắc 18', 'Nhà sản xuất 18', 0),
('Sản phẩm 19', 'Chất liệu 19', 1800000, 90, 'Mô tả sản phẩm 19', 'Loại 19', 'Màu sắc 19', 'Nhà sản xuất 19', 1),
('Sản phẩm 20', 'Chất liệu 20', 1300000, 120, 'Mô tả sản phẩm 20', 'Loại 20', 'Màu sắc 20', 'Nhà sản xuất 20', 1);

-- Thêm dữ liệu cho bảng GioHangChiTiet
INSERT INTO GioHangChiTiet (MaGioHang, MaSanPham, SoLuong, GhiChu, TrangThai)
VALUES
('31d021c2-ea89-4672-8cc9-1ab8676ee816', 1, 2, 'Ghi chú sản phẩm trong giỏ hàng 1', 1),
('1a5062a5-d26e-4a7e-88c5-242c264cd4f7', 2, 3, 'Ghi chú sản phẩm trong giỏ hàng 2', 1),
('f61020ce-96e1-4328-883e-338e4e189c45', 3, 1, 'Ghi chú sản phẩm trong giỏ hàng 3', 0),
('88fb13b6-e67f-4fa6-b442-3f606d96f54a', 4, 4, 'Ghi chú sản phẩm trong giỏ hàng 4', 1),
('1f5451b9-9434-4d6f-b433-54ac991e99db', 5, 2, 'Ghi chú sản phẩm trong giỏ hàng 5', 0),
('a9575a0c-f5e3-4f52-b355-58d44460dc79', 6, 1, 'Ghi chú sản phẩm trong giỏ hàng 6', 1),
('fbe98a67-c50a-45e2-83d0-61f788ef6b6d', 7, 3, 'Ghi chú sản phẩm trong giỏ hàng 7', 1),
('6f6fca93-5cf2-4f4a-b2dd-622cf82ec543', 8, 2, 'Ghi chú sản phẩm trong giỏ hàng 8', 0),
('4343a935-a9bf-45e9-8f0a-fd363756c97f', 9, 1, 'Ghi chú sản phẩm trong giỏ hàng 9', 1),
('8b68e3ed-ebbf-4f64-8b8a-7a62c76e33e6', 10, 3, 'Ghi chú sản phẩm trong giỏ hàng 10', 0),
('87bcec1e-a3b0-4c06-a918-8094055424cb', 11, 2, 'Ghi chú sản phẩm trong giỏ hàng 11', 1),
('f03e9226-8ca6-49f4-94ac-adc634f5367a', 12, 1, 'Ghi chú sản phẩm trong giỏ hàng 12', 1),
('361aedcf-89ae-430c-bf85-b7566a609a4c', 13, 4, 'Ghi chú sản phẩm trong giỏ hàng 13', 0),
('89e14913-aba8-452d-9d39-c3155d656c2c', 14, 2, 'Ghi chú sản phẩm trong giỏ hàng 14', 1),
('a43411de-22cf-494e-9b0c-c826de24f018', 15, 3, 'Ghi chú sản phẩm trong giỏ hàng 15', 1),
('683adb92-8f18-44be-853b-d0e9e1d210eb', 16, 1, 'Ghi chú sản phẩm trong giỏ hàng 16', 0),
('03c46d14-5ddb-4237-865a-d2c8b027bfdf', 17, 2, 'Ghi chú sản phẩm trong giỏ hàng 17', 1),
('8439b4e0-c99f-4c01-afc3-d37c0458af79', 18, 3, 'Ghi chú sản phẩm trong giỏ hàng 18', 0),
('279f60b6-3a10-4391-89b2-da47193cf582', 19, 2, 'Ghi chú sản phẩm trong giỏ hàng 19', 1),
('39409da4-f1ed-4116-a9c3-f2ac1504e3d6', 20, 1, 'Ghi chú sản phẩm trong giỏ hàng 20', 1);

-- Thêm dữ liệu cho bảng YeuThichChiTiet
INSERT INTO YeuThichChiTiet (MaDanhSach, MaSanPham, GhiChu, TrangThai)
VALUES
('c986e2e9-1f52-4e4f-a0c0-042e6e799b6c', 1, 'Ghi chú sản phẩm yêu thích 1', 1),
('239a9f03-8c7c-4d74-9f64-095929aba9e2', 2, 'Ghi chú sản phẩm yêu thích 2', 1),
('8d9826ff-7cbc-49ff-8eec-0a1eae41fa14', 3, 'Ghi chú sản phẩm yêu thích 3', 0),
('d7946434-4be3-4846-a397-0bc1894032fd', 4, 'Ghi chú sản phẩm yêu thích 4', 1),
('79141094-9b76-4e1c-9daf-1182e4d8bd06', 5, 'Ghi chú sản phẩm yêu thích 5', 0),
('3dae5826-d2e2-45b3-ac87-1b942b9899e6', 6, 'Ghi chú sản phẩm yêu thích 6', 1),
('6e8e9e24-c1a8-4058-9945-1f601184cab4', 7, 'Ghi chú sản phẩm yêu thích 7', 1),
('bcecbbf7-857b-4a95-9d49-3969eca2100e', 8, 'Ghi chú sản phẩm yêu thích 8', 0),
('f680b034-655d-42fa-a9e9-5b7caffe2027', 9, 'Ghi chú sản phẩm yêu thích 9', 1),
('bc882bb1-cff2-4118-bb99-7ad6c3621e8d', 10, 'Ghi chú sản phẩm yêu thích 10', 0),
('4cd49fba-0a85-4019-a24c-975091dd6107', 11, 'Ghi chú sản phẩm yêu thích 11', 1),
('535f9199-5cd3-4184-b69e-9efda49b0364', 12, 'Ghi chú sản phẩm yêu thích 12', 1),
('70d5727c-56ab-4059-8d3c-aef0ced3c0e4', 13, 'Ghi chú sản phẩm yêu thích 13', 0),
('13dc94a0-5870-4a6c-b3ac-da4f66d845db', 14, 'Ghi chú sản phẩm yêu thích 14', 1),
('cb9d06b3-abac-44e6-93ec-dc7ceb652e0a', 15, 'Ghi chú sản phẩm yêu thích 15', 1),
('a5911ff5-2bd2-42da-acee-e35d3ff99ab1', 16, 'Ghi chú sản phẩm yêu thích 16', 0),
('64361267-ef9f-4d4c-baea-e65d305e4e56', 17, 'Ghi chú sản phẩm yêu thích 17', 1),
('0c6c4f22-e025-4a70-9556-f5f24c778f49', 18, 'Ghi chú sản phẩm yêu thích 18', 0),
('a8f79263-62c3-4a9a-9f80-fcbda8d34f06', 19, 'Ghi chú sản phẩm yêu thích 19', 1),
('f9120d83-a2c0-4814-8045-fd9883b0e92e', 20, 'Ghi chú sản phẩm yêu thích 20', 1);

-- Thêm dữ liệu cho bảng PhieuGiaoHang
INSERT INTO PhieuGiaoHang ( NguoiNhan, SdtNhan, NguoiGiao, SdtGiao, NgayGiao, NgayNhan, NguoiTao, PhiGiaoHang, HoaDonGiao, DiaChiGiao, GhiChu, TrangThai)
VALUES
( 'Người nhận 1', '0123456789', 'Người giao 1', '0987654321', '2024-02-25', '2024-02-26', 'Người tạo 1', 50000, 1, '917430be-fc02-4c66-8d56-12d29b6a9905', 'Ghi chú phiếu giao hàng 1', 1),
( 'Người nhận 2', '0123456789', 'Người giao 2', '0987654321', '2024-02-26', '2024-02-27', 'Người tạo 2', 60000, 2, '0d5f48ed-0619-4208-bf59-1a3fe4b42084', 'Ghi chú phiếu giao hàng 2', 1),
( 'Người nhận 3', '0123456789', 'Người giao 3', '0987654321', '2024-02-27', '2024-02-28', 'Người tạo 3', 70000, 3, '51e63481-cd33-41ff-96aa-342863e34a4a', 'Ghi chú phiếu giao hàng 3', 0),
( 'Người nhận 4', '0123456789', 'Người giao 4', '0987654321', '2024-02-28', '2024-02-29', 'Người tạo 4', 80000, 4, '9936103f-2a75-49f6-b03f-4b68d4e5e5f0', 'Ghi chú phiếu giao hàng 4', 1),
( 'Người nhận 5', '0123456789', 'Người giao 5', '0987654321', '2024-02-29', '2024-03-01', 'Người tạo 5', 90000, 5, '1dbe5223-b260-4fad-b483-4f5a13222911', 'Ghi chú phiếu giao hàng 5', 0),
( 'Người nhận 6', '0123456789', 'Người giao 6', '0987654321', '2024-03-01', '2024-03-02', 'Người tạo 6', 100000, 6, 'aae4ed6a-97d2-4c1e-8614-54bbe8a39076', 'Ghi chú phiếu giao hàng 6', 1),
( 'Người nhận 7', '0123456789', 'Người giao 7', '0987654321', '2024-03-02', '2024-03-03', 'Người tạo 7', 110000, 7, '48b690c1-5bca-40bb-98ec-6f31b3683b81', 'Ghi chú phiếu giao hàng 7', 1),
( 'Người nhận 8', '0123456789', 'Người giao 8', '0987654321', '2024-03-03', '2024-03-04', 'Người tạo 8', 120000, 8, '603d99b4-d82f-4153-9d49-7bbf4dadb446', 'Ghi chú phiếu giao hàng 8', 0),
( 'Người nhận 9', '0123456789', 'Người giao 9', '0987654321', '2024-03-04', '2024-03-05', 'Người tạo 9', 130000, 9, 'da893e4b-bd6a-4a39-b830-80b844ca87ec', 'Ghi chú phiếu giao hàng 9', 1),
( 'Người nhận 10', '0123456789', 'Người giao 10', '0987654321', '2024-03-05', '2024-03-06', 'Người tạo 10', 140000, 10, '69bfb2ed-10c7-44f3-a181-80d80c1096b2', 'Ghi chú phiếu giao hàng 10', 0),
( 'Người nhận 11', '0123456789', 'Người giao 11', '0987654321', '2024-03-06', '2024-03-07', 'Người tạo 11', 150000, 11, '3ec42ef6-b3bb-4802-a7dd-8c198a38a94a', 'Ghi chú phiếu giao hàng 11', 1),
( 'Người nhận 12', '0123456789', 'Người giao 12', '0987654321', '2024-03-07', '2024-03-08', 'Người tạo 12', 160000, 12, 'c1f6be66-0737-4154-ba5e-8d26a826e422', 'Ghi chú phiếu giao hàng 12', 1),
( 'Người nhận 13', '0123456789', 'Người giao 13', '0987654321', '2024-03-08', '2024-03-09', 'Người tạo 13', 170000, 13, '21bc4330-005b-4790-9476-95a214c00677', 'Ghi chú phiếu giao hàng 13', 0),
('Người nhận 14', '0123456789', 'Người giao 14', '0987654321', '2024-03-09', '2024-03-10', 'Người tạo 14', 180000, 14, 'ab53058a-41ed-4f6a-a09b-99a2064f0476', 'Ghi chú phiếu giao hàng 14', 1),
( 'Người nhận 15', '0123456789', 'Người giao 15', '0987654321', '2024-03-10', '2024-03-11', 'Người tạo 15', 190000, 15, '95460fb9-56aa-49f1-bdfb-b47d7e9ac38c', 'Ghi chú phiếu giao hàng 15', 1),
( 'Người nhận 16', '0123456789', 'Người giao 16', '0987654321', '2024-03-11', '2024-03-12', 'Người tạo 16', 200000, 16, '984f3d15-d5d6-49f7-b244-ba25cb8476ed', 'Ghi chú phiếu giao hàng 16', 0),
( 'Người nhận 17', '0123456789', 'Người giao 17', '0987654321', '2024-03-12', '2024-03-13', 'Người tạo 17', 210000, 17, 'e9546d42-dea9-4218-9a7e-bc3fc975de70', 'Ghi chú phiếu giao hàng 17', 1),
( 'Người nhận 18', '0123456789', 'Người giao 18', '0987654321', '2024-03-13', '2024-03-14', 'Người tạo 18', 220000, 18, 'a4fd6e90-6617-4424-adc7-f3ae2782c8e9', 'Ghi chú phiếu giao hàng 18', 1),
('Người nhận 19', '0123456789', 'Người giao 19', '0987654321', '2024-03-14', '2024-03-15', 'Người tạo 19', 230000, 19, '24916f80-6afa-4b0a-ab45-f470265b379e', 'Ghi chú phiếu giao hàng 19', 0),
('Người nhận 20', '0123456789', 'Người giao 20', '0987654321', '2024-03-15', '2024-03-16', 'Người tạo 20', 240000, 20, '23f70a8a-9dce-4e09-926e-fe6f3119f1f8', 'Ghi chú phiếu giao hàng 20', 1);

-- Thêm dữ liệu cho bảng HoaDonChiTiet
INSERT INTO HoaDonChiTiet (MaHoaDon, MaSanPham, SoLuong, DonGia, GhiChu, TrangThai)
VALUES
(1, 1, 5, 100000, 'Ghi chú sản phẩm 1', 1),
(1, 2, 3, 150000, 'Ghi chú sản phẩm 2', 1),
(1, 3, 2, 200000, 'Ghi chú sản phẩm 3', 0),
(2, 4, 4, 120000, 'Ghi chú sản phẩm 4', 1),
(2, 5, 2, 180000, 'Ghi chú sản phẩm 5', 0),
(2, 6, 1, 250000, 'Ghi chú sản phẩm 6', 1),
(3, 7, 3, 160000, 'Ghi chú sản phẩm 7', 1),
(3, 8, 6, 130000, 'Ghi chú sản phẩm 8', 0),
(3, 9, 2, 220000, 'Ghi chú sản phẩm 9', 1),
(4, 10, 4, 110000, 'Ghi chú sản phẩm 10', 0),
(4, 11, 5, 190000, 'Ghi chú sản phẩm 11', 1),
(4, 12, 1, 280000, 'Ghi chú sản phẩm 12', 1),
(5, 13, 2, 170000, 'Ghi chú sản phẩm 13', 0),
(5, 14, 3, 140000, 'Ghi chú sản phẩm 14', 1),
(5, 15, 4, 200000, 'Ghi chú sản phẩm 15', 1),
(6, 16, 1, 250000, 'Ghi chú sản phẩm 16', 0),
(6, 17, 2, 210000, 'Ghi chú sản phẩm 17', 1),
(6, 18, 3, 180000, 'Ghi chú sản phẩm 18', 0),
(7, 19, 5, 130000, 'Ghi chú sản phẩm 19', 1),
(7, 20, 4, 220000, 'Ghi chú sản phẩm 20', 1);

