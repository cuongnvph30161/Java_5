package com.example.thijava5.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "HangKhachHang")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HangKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maHang;
    private String tenHang;

}
