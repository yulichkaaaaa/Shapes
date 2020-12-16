package com.yuliana.shapes.model.repository.specification.impl;

import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.repository.specification.Specification;

public class FirstYIntervalSpecification implements Specification<Ellipse> {
    private int begin;
    private int end;

    public FirstYIntervalSpecification(int begin, int end){
        this.begin = begin;
        this.end = end;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        int y = ellipse.getFirstPoint().getY();
        boolean result = (y > begin) && (y < end);
        return result;
    }
}
