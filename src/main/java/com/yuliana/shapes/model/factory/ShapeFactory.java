package com.yuliana.shapes.model.factory;

import com.yuliana.shapes.model.entity.Point;
import com.yuliana.shapes.model.entity.Shape2D;

import java.util.List;

public abstract class ShapeFactory<T extends Shape2D> {

    public abstract T createInstance(List<Integer> coordinates);
}
