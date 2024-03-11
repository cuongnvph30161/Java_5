package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "khach_hang")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_khach_hang")
    private Integer maKhachHang;
    @Column(name = "ho_ten_dem")
    private String hoTenDem;
    @Column(name = "ten")
    private String ten;
    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

}
