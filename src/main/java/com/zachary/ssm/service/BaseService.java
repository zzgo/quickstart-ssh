package com.zachary.ssm.service;

import java.util.List;

public interface BaseService<T, ID> {
    T save(T t);

    T update(T t);

    int delete(ID id);

    List<T> findAll();
}
