package com.demo.spring_security.repository;

import com.demo.spring_security.entity.AppUser;
import com.demo.spring_security.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
