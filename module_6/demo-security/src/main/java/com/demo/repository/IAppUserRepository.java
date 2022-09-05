package com.demo.repository;

public interface IAppUserRepository {
    @Query(value = " select au.id, au.is_deleted, au.creation_date, au.password, au.user_name from app_user au where au.user_name = :username ",
            nativeQuery = true)
    AppUser getAppUserByUsername(@Param("username") String username);
}
