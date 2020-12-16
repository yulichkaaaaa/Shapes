package com.yuliana.shapes.model.repository.specification.impl;

import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.repository.specification.Specification;

public class FirstXIntervalSpecification implements Specification<Ellipse> {

    private int begin;
    private int end;

    public FirstXIntervalSpecification(int begin, int end){
        this.begin = begin;
        this.end = end;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        int x = ellipse.getFirstPoint().getX();
        boolean result = (x > begin) && (x < end);
        return result;
    }
}
