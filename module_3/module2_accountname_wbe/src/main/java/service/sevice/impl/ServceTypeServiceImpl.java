package service.sevice.impl;

import model.service.ServiceType;
import repository.sevice.IServiceTypeRepository;
import repository.sevice.impl.ServceTypeRepository;
import service.sevice.IServiceTypeService;

import java.util.List;

public class ServceTypeServiceImpl implements IServiceTypeService {
    private IServiceTypeRepository iServiceTypeRepository = new ServceTypeRepository();
    @Override
    public List<ServiceType> getAllServiceType() {
        return iServiceTypeRepository.getAllServiceType();
    }
}
