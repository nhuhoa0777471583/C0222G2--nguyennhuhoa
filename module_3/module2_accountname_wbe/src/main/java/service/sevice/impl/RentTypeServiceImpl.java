package service.sevice.impl;

import model.service.RentType;
import repository.sevice.IRentTypeRepository;
import repository.sevice.impl.RentTypeRepository;
import service.sevice.IRentTypeService;

import java.util.List;

public class RentTypeServiceImpl implements IRentTypeService {
    private IRentTypeRepository iRentTypeRepository = new RentTypeRepository();
    @Override
    public List<RentType> getAllRentType() {
        return iRentTypeRepository.getAllRentType();
    }
}
