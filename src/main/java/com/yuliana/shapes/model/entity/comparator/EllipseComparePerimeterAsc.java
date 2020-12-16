package com.yuliana.shapes.model.entity.comparator;

import com.yuliana.shapes.model.entity.EllipseProperty;

import java.util.Comparator;

public class EllipseComparePerimeterAsc implements Comparator<EllipseProperty> {
    @Override
    public int compare(EllipseProperty firstProperty, EllipseProperty secondProperty) {
        Double firstPerimeter = firstProperty.getPerimeter();
        Double secondPerimeter = secondProperty.getPerimeter();
        return firstPerimeter.compareTo(secondPerimeter);
    }
}
