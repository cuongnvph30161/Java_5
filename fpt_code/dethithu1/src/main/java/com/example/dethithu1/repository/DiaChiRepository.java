package com.example.dethithu1.repository;

import com.example.dethithu1.entity.DiaChi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DiaChiRepository extends JpaRepository<DiaChi, UUID> {
}
