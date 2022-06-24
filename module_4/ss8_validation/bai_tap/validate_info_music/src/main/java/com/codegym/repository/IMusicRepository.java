package com.codegym.repository;

import com.codegym.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMusicRepository extends JpaRepository<Music, Integer> {

    @Query(value = "select * from music ", nativeQuery = true)
    List<Music> displayAllMusic();
}
