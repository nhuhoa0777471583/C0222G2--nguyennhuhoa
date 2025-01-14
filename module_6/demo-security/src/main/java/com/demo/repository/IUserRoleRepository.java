package com.demo.repository;

import com.demo.model.account.AppUser;
import com.demo.model.account.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findAllByAppUser(AppUser appUser);

}
