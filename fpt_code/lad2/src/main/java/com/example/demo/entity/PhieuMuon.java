package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
@Entity
@Table(name = "phieu_muon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PhieuMuon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_phieu_muon")
    private Integer maPhieuMuon;
    @Column(name = "ngay_muon")
    private Date ngayMuon;
    @Column(name = "ngay_tra")
    private Date ngayTra;
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;
}
