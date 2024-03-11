package com.example.dethithu2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDate;


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

    private String soDienThoai;
    private Date sinhNhat;
    private boolean gioiTinh;

    @ManyToOne
    @JoinColumn(name = "hangkhachhang")
    private HangKhachHang hangKhachHang;

}
