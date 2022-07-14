package com.thi.service;

import com.thi.model.HopDong;

import java.util.List;

public interface IHopDongService {

    List<HopDong> findAll();
    void save(HopDong hopDong);
    void delete(Integer id);
}
