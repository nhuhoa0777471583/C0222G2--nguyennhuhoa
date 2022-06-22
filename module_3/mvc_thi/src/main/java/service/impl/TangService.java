package service.impl;

import model.Tang;
import repository.ITangRepository;
import repository.impl.TangRepository;
import service.ITangService;

import java.util.List;

public class TangService implements ITangService {
    private ITangRepository iTangRepository = new TangRepository();
    @Override
    public List<Tang> getAll() {
        return iTangRepository.getAll();
    }
}
