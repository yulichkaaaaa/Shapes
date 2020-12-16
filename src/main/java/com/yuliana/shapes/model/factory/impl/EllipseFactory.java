package com.yuliana.shapes.model.factory.impl;

import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.entity.Point;
import com.yuliana.shapes.model.factory.ShapeFactory;
import com.yuliana.shapes.util.IdGenerator;

import java.util.List;

public class EllipseFactory extends ShapeFactory<Ellipse> {
    @Override
    public Ellipse createInstance(List<Integer> coordinates) {
        Point firstPoint = new Point(coordinates.get(0), coordinates.get(1));
        Point secondPoint = new Point(coordinates.get(2), coordinates.get(3));
        return new Ellipse(IdGenerator.generateId(), firstPoint, secondPoint);
    }
}
