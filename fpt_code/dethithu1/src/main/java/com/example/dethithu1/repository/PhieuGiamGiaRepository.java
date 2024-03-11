package com.example.dethithu1.repository;

import com.example.dethithu1.entity.KhachHang;
import com.example.dethithu1.entity.PhieuGiamGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhieuGiamGiaRepository extends JpaRepository<PhieuGiamGia,String> {
    Page<PhieuGiamGia> findAll(Pageable pageable);
    @Query(value = "SELECT pgg.* " +
            "FROM PhieuGiamGia pgg " +
            "JOIN KhachHang kh ON pgg.NguoiSoHuu = kh.MaKhachHang " +
            "WHERE kh.MaKhachHang = ? ", nativeQuery = true)
    List<PhieuGiamGia> searchPhieuGiamGiaByMaKhachHang(Integer maKhachHang);

}
