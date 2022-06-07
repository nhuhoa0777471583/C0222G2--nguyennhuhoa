package service.employee.impl;

import model.employee.Education;
import repository.employee.IEducationRepository;
import repository.employee.imlp.EducationRepositoryImpl;
import service.employee.IEducationService;

import java.util.List;

public class EducationServiceImpl implements IEducationService {
    private IEducationRepository iEducationRepository = new EducationRepositoryImpl();
    @Override
    public List<Education> getAllEducationService() {
        return iEducationRepository.getAllEducation();
    }
}
