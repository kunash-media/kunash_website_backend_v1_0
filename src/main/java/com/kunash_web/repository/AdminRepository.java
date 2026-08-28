package com.kunash_web.repository;

import com.kunash_web.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

    Optional<AdminEntity> findByAdminId(String adminId);
    Optional<AdminEntity> findByAdminMobileNumber(String mobileNumber);
    boolean existsByAdminId(String adminId);
    boolean existsByAdminMobileNumber(String mobileNumber);
    boolean existsByAdminRole(String role);
}