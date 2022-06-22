package service.impl;

import model.LoaiVanPhong;
import repository.ILoaiVanPhongRepository;
import repository.impl.LoaiVanPhongRepositoryImpl;
import service.ILoaiVanPhongService;

import java.util.List;

public class LoaiVanPhongServiceImpl implements ILoaiVanPhongService {
    private ILoaiVanPhongRepository iLoaiVanPhongRepository = new LoaiVanPhongRepositoryImpl();
    @Override
    public List<LoaiVanPhong> getAll() {
        return iLoaiVanPhongRepository.getAll();
    }
}
