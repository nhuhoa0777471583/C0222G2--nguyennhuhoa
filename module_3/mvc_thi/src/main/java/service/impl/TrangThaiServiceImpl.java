package service.impl;

import model.TrangThai;
import repository.ITrangThaiRepository;
import repository.impl.TrangThaiRepositoryImpl;
import service.ITrangThaiService;

import java.util.List;

public class TrangThaiServiceImpl implements ITrangThaiService {
    private ITrangThaiRepository iTrangThaiRepository = new TrangThaiRepositoryImpl();
    @Override
    public List<TrangThai> getAll() {
        return iTrangThaiRepository.getAll();
    }
}
