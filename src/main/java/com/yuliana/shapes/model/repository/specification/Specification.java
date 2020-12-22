package com.yuliana.shapes.model.repository.specification;

import com.yuliana.shapes.model.entity.Shape2D;

@FunctionalInterface
public interface Specification<T extends Shape2D> {
    boolean specify(T t);
}
