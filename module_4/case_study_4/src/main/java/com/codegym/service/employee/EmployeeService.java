package com.codegym.service.employee;

import com.codegym.model.employee.Employee;
import com.codegym.repository.employee.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;
    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return this.iEmployeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        this.iEmployeeRepository.save(employee);
    }
}
