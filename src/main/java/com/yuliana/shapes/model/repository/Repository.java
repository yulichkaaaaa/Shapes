package com.yuliana.shapes.model.repository;

import com.yuliana.shapes.model.repository.specification.Specification;

import java.util.Comparator;
import java.util.List;
public interface Repository<T> {
    void add(T t);
    void remove(T t);
    T get(int index);
    List<T> sort(Comparator<? super T> comparator );

    List<T> query(Specification<T> specification);
}
