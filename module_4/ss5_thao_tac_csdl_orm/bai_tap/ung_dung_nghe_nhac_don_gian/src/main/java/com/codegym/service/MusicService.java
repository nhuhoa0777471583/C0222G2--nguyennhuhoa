package com.codegym.service;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import com.codegym.repository.impl.MusicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    private IMusicRepository iMusicRepository = new MusicRepository();

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        this.iMusicRepository.save(music);
    }

    @Override
    public Music findById(Integer id) {
        return iMusicRepository.findById(id);
    }

    @Override
    public void update(Music music) {
        this.iMusicRepository.update(music);
    }

    @Override
    public void delete(Integer id) {
        this.iMusicRepository.delete(id);
    }
}
