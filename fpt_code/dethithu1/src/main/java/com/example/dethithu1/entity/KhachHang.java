package com.example.dethithu1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "KhachHang")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makhachhang")
    private Integer maKhachHang;
    @Column(name = "tenkhachhang")
    private String tenKhachHang;

}
