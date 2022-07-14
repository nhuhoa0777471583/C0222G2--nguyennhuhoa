package com.thi.service.impl;

import com.thi.model.HopDong;
import com.thi.repository.IHopDongRepository;
import com.thi.service.IHopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopDongService implements IHopDongService {

    @Autowired
    private IHopDongRepository iHopDongRepository;

    @Override
    public List<HopDong> findAll() {
        return iHopDongRepository.findAll();
    }

    @Override
    public void save(HopDong hopDong) {
        this.iHopDongRepository.save(hopDong);
    }

    @Override
    public void delete(Integer id) {
        this.iHopDongRepository.deleteById(id);
    }
}
