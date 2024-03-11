package com.example.dethithuso4.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "KhachHang")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKhachHang;
    private String tenKhachHang;
    private Date sinhNhat;
    private String soDienThoai;
    private boolean gioiTinh;
    private Integer trangThai;

    @ManyToOne()
    @JoinColumn(name = "hangkhachhang")
    private HangKhachHang hangKhachHang;


}
