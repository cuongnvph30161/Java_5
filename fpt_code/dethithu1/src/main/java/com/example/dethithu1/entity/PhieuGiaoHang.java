package com.example.dethithu1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "phieugiaohang")
public class PhieuGiaoHang {
    @Column(name = "MaPhieuGiao")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID maPhieuGiao;
    @Column(name = "nguoinhan")
    @NotNull
    private String nguoiNhan;
    @Column(name = "sdtnhan")
    private String sdtNguoiNhan;
    @Column(name = "nguoigiao")
    private String nguoiGiao;
    @Column(name = "sdtgiao")
    private String sdtNguoiGiao;
    @Column(name = "ngaygiao")
    private LocalDate ngayGiao;
    @Column(name = "ngaynhan")
    private LocalDate ngayNhan;

    @Column(name = "phigiaohang")
    private Double phiGiaoHang;
    @ManyToOne
    @JoinColumn(name = "diachigiao")
    private DiaChi diaChi;

    @ManyToOne
    @JoinColumn(name = "hoadongiao")
    private HoaDon hoaDon;
    @Column(name = "trangthai")
    private Integer trangThai;
}
