package service.sevice.impl;

import model.service.Service;
import repository.sevice.IServiceRepository;
import repository.sevice.impl.ServiceRepositoryImpl;
import service.sevice.IServiceService;

import java.util.List;

public class ServiceServiceImpl implements IServiceService {
    private IServiceRepository iServiceRepository = new ServiceRepositoryImpl();
    @Override
    public List<Service> getAllService() {
        return iServiceRepository.getAllService();
    }
}
