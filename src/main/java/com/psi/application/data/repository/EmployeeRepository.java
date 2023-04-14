package com.psi.application.data.repository;

import com.psi.application.data.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository
        extends
            JpaRepository<Employee, Long>,
            JpaSpecificationExecutor<Employee> {
}
