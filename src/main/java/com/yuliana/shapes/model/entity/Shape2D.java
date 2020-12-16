package com.yuliana.shapes.model.entity;

public class Shape2D {

    private String name;

    public Shape2D(String name) {
        this.name = name;
    }

    public Shape2D(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape2D{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
