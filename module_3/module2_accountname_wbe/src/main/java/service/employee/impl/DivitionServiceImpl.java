package service.employee.impl;

import model.employee.Divition;
import repository.employee.IDivitionRepository;
import repository.employee.imlp.DivitionRepositoryImpl;

import java.util.List;

public class DivitionServiceImpl implements IDivitionRepository {
    private IDivitionRepository iDivitionRepository = new DivitionRepositoryImpl();

    @Override
    public List<Divition> getAllDivition() {
        return iDivitionRepository.getAllDivition();
    }
}
