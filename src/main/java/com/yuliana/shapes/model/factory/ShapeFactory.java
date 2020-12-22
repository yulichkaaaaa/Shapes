package com.yuliana.shapes.model.factory;

import com.yuliana.shapes.model.entity.Shape2D;

import java.util.List;

public interface ShapeFactory<T extends Shape2D> {

    T createInstance(List<Integer> coordinates);
}
