package com.psi.application.data.service;

import com.psi.application.data.entity.Employee;
import com.psi.application.data.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements ICrudService<Employee, Long> {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Employee> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public Page<Employee> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Employee> list(Pageable pageable, Specification<Employee> filter) {
        return repository.findAll(filter, pageable);
    }
}
