package com.example.dethithu2.repository;

import com.example.dethithu2.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Integer>{

    @Query(value = "select * from KhachHang where maKhachHang = :searchKeyword   or SoDienThoai = :searchKeyword ", nativeQuery = true)
    List<KhachHang> searchKhachHangByTenAndSdt(@Param("searchKeyword") String searchKeyword);
}
