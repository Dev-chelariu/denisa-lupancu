package com.psi.application.data.service;

import com.psi.application.data.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;

public interface ICrudService<T,ID> {

    Optional<T> get(ID id);

    Page<Employee> list(Pageable pageable);

    Page<Employee> list(Pageable pageable, Specification<T> filter);
}
