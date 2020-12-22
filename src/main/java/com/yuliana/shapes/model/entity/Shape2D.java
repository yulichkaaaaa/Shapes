package com.yuliana.shapes.model.entity;

abstract public class Shape2D {

    private long shapeId;

    public Shape2D(long shapeId) {
        this.shapeId = shapeId;
    }

    public Shape2D(){}

    public long getShapeId() {
        return shapeId;
    }

    public void setShapeId(long shapeId) {
        this.shapeId = shapeId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape2D{");
        sb.append("name='").append(shapeId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
