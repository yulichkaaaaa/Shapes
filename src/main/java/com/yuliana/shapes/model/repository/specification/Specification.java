package com.yuliana.shapes.model.repository.specification;

@FunctionalInterface
public interface Specification<T> {
    boolean specify(T t);
}
