package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "PhieuGiamGia")
public class PhieuGiamGia {
    @Column(name = "MaPhieu")
    @Id
    private String maPhieu;
    @Column(name = "TenPhieu")
    private String tenPhieu;
    @Column(name = "NgayBatDau")
    private Date ngayBatDau;
    @Column(name = "NgayKetThuc")
    private Date ngayKetThuc;
    @Column(name = "GiaTriGiam")
    private Double giaTriGiam;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "NguoiSoHuu")
    private KhachHang khachhang;
}
