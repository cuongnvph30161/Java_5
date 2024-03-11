package com.example.dethithu1.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table(name = "phieugiamgia")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class PhieuGiamGia {

    @Id
    @Column(name = "maphieu")
    private String maPhieu;
    @Column(name = "tenphieu")
    private String tenPhieu;
    @Column(name = "ngaybatdau")
    private Date ngayBatDau;
    @Column(name = "ngayketthuc")
    private Date ngayKetThuc;
    @Column(name = "giatrigiam")
    private Double giaTriGiam;
    @Column(name = "giatrigiamtoida")
    private Double giaTriGiamToiDa;
    @Column(name = "trangthai")
    private Integer trangThai;

    @ManyToOne
    @JoinColumn(name = "nguoisohuu")
    private KhachHang khachhang;


}
