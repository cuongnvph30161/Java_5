package com.example.thijava5.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.NotFound;

@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKhachHang;
    private String tenKhachHang;

    private String soDienThoai;
    private boolean gioiTinh;
    @ManyToOne
    @JoinColumn(name = "HangKhachHang")
    private HangKhachHang hangKhachHang;
}
