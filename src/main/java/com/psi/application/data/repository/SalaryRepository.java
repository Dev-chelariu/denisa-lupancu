package com.psi.application.data.repository;

import com.psi.application.data.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalaryRepository extends JpaRepository<Salary, Long>, JpaSpecificationExecutor<Salary> {
}
