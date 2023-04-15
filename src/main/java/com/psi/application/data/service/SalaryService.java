package com.psi.application.data.service;

import com.psi.application.data.entity.Salary;
import com.psi.application.data.repository.SalaryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalaryService implements ICrudService<Salary, Long> {

    private final SalaryRepository salaryRepository;

    public SalaryService(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    @Override
    public Optional<Salary> get(Long aLong) {
        return Optional.empty ();
    }

    @Override
    public Page<Salary> list(Pageable pageable) {
        return salaryRepository.findAll (pageable);
    }

    @Override
    public Page<Salary> list(Pageable pageable, Specification<Salary> filter) {
        return salaryRepository.findAll (filter, pageable);
    }

    @Override
    public Salary save(Salary object) {
        return null;
    }

    @Override
    public void delete(Salary object) {

    }
}
