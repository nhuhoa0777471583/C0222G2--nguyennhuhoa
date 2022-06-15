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

    @Override
    public void save(Service service) {
        this.iServiceRepository.save(service);
    }

    @Override
    public void delete(Integer id) {
        this.iServiceRepository.delete(id);
    }

    @Override
    public Service findById(Integer id) {
        return iServiceRepository.findById(id);
    }

    @Override
    public void update(Service service) {
        this.iServiceRepository.update(service);
    }
}
