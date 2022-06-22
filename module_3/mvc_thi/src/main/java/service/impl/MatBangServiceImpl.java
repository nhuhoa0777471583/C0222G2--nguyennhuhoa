package service.impl;

import model.MatBang;
import repository.IMatBangRepository;
import repository.impl.MatBangRepositoryImpl;
import service.IMatBangService;

import java.util.List;

public class MatBangServiceImpl implements IMatBangService {
    private IMatBangRepository iMatBangRepository = new MatBangRepositoryImpl();
    @Override
    public List<MatBang> getAll() {
        return iMatBangRepository.getAll();
    }

    @Override
    public void save(MatBang matBang) {
        this.iMatBangRepository.save(matBang);
    }

    @Override
    public void delete(String id) {
       this.iMatBangRepository.delete(id);
    }
}
