package com.psi.application.data.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;

public interface ICrudService<T, ID> {

    Optional<T> get(ID id);

    Page<T> list(Pageable pageable);

    Page<T> list(Pageable pageable, Specification<T> filter);

    T save(T object);

    void delete(T object);

}
