package com.codegym.repository;


import com.codegym.model.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ICountRepository extends JpaRepository<Count, String> {
    @Modifying
    @Transactional
    @Query(value = " update count set count_view = count_view +1 ", nativeQuery = true)
    void addCount();

    @Query(value =" select * from count ", nativeQuery = true)
    Count displayCount();


}
