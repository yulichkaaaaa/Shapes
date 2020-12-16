package com.yuliana.shapes.model.repository.specification.impl;

import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.repository.specification.Specification;

public class IdSpecification implements Specification<Ellipse> {

    private long ellipseId;

    public IdSpecification(long ellipseId){
        this.ellipseId = ellipseId;
    }

    @Override
    public boolean specify(Ellipse ellipse) {
        return ellipseId == ellipse.getEllipseId();
    }
}
