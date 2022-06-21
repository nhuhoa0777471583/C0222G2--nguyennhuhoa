package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {

    List<Music> findAll();

    void save(Music music);

    Music findById(Integer id);

    void update( Music music);

    void delete(Integer id);

}
