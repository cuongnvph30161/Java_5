package com.example.dethithu3.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "phieugiaohang")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class PhieuGiaoHang {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "maphieugiao")
    private UUID maPhieuGiao;

    @Column(name = "nguoinhan")
    private String nguoiNhan;

    @Column(name = "sdtgiao")
    private String sdtGiao;

    @Column(name = "ngaygiao")
    private Date ngayGiao;

    @Column(name = "trangthai")
    private Integer trangThai;

    @ManyToOne()
    @JoinColumn(name="diachigiao")
    private DiaChi diaChi;

}
