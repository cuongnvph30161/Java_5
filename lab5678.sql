create database lad5678
use lad5678
CREATE TABLE khach_hang (
    ma_khach_hang INT IDENTITY(1,1) PRIMARY KEY,
    ho_ten_dem VARCHAR(50),
    ten VARCHAR(50),
    dia_chi VARCHAR(100),
    so_dien_thoai VARCHAR(15)
);

CREATE TABLE phieu_muon (
    ma_phieu_muon INT IDENTITY(1,1) PRIMARY KEY,
    ma_khach_hang INT,
    ngay_muon DATE,
    ngay_tra DATE,
    FOREIGN KEY (ma_khach_hang) REFERENCES khach_hang(ma_khach_hang)
);


CREATE TABLE sach (
    ma_sach INT IDENTITY(1,1) PRIMARY KEY,
    ten_sach VARCHAR(100),
    tac_gia VARCHAR(50),
    nha_xuat_ban VARCHAR(50),
    nam_xuat_ban INT,
    gia DECIMAL(10, 2)
);
CREATE TABLE chi_tiet_phieu_muon (
    ma_chi_tiet_phieu_muon INT IDENTITY(1,1) PRIMARY KEY,
    ma_phieu_muon INT,
    ma_sach INT,
    ten_san_pham VARCHAR(50),
    so_luong INT,
    gia DECIMAL(10, 2),
    FOREIGN KEY (ma_phieu_muon) REFERENCES phieu_muon(ma_phieu_muon),
    FOREIGN KEY (ma_sach) REFERENCES sach(ma_sach)
);