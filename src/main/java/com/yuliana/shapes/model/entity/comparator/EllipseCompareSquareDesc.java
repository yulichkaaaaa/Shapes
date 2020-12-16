package com.yuliana.shapes.model.entity.comparator;

import com.yuliana.shapes.model.entity.EllipseProperty;

import java.util.Comparator;

public class EllipseCompareSquareDesc implements Comparator<EllipseProperty> {
    @Override
    public int compare(EllipseProperty firstProperty, EllipseProperty secondProperty) {
        Double firstSquare = firstProperty.getSquare();
        Double secondSquare = secondProperty.getSquare();
        return secondSquare.compareTo(firstSquare);
    }
}