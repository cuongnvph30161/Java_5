package com.example.dethithu2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hangkhachhang")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class HangKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maHang;
    private String tenHang;
}
