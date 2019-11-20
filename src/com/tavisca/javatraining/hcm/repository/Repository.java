package com.tavisca.javatraining.hcm.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    List<T> findAll();

    Optional<T> findById();

    T save(T item);

    T remove(T item);
}
