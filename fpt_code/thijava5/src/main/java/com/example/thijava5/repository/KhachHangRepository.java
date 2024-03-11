package com.example.thijava5.repository;

import com.example.thijava5.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
    @Transactional
    @Modifying
    @Query(value = "delete from KhachHang where SoDienThoai='?'", nativeQuery = true)
    void deleteBySdt(String sdt);

    @Query(value = "select * from KhachHang where TenKhachHang='?' or SoDienThoai='?'",nativeQuery = true)
    List<KhachHang> search(String key);


}
