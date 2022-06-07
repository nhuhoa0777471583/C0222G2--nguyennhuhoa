package service.employee.impl;

import model.employee.Position;
import repository.employee.IPositionRepository;
import repository.employee.imlp.PositionRepositoryImpl;
import service.employee.IPositionService;

import java.util.List;

public class PositionServiceImpl implements IPositionService {
    private IPositionRepository iPositionRepository = new PositionRepositoryImpl();
    @Override
    public List<Position> getAllPositionService() {
        return iPositionRepository.getAllPosition();
    }
}
