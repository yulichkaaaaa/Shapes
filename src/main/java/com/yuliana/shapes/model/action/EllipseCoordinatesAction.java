package com.yuliana.shapes.model.action;

import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.entity.Point;

public class EllipseCoordinatesAction {

    public boolean crossesHorizontalAxe(Ellipse ellipse){
        Point firstPoint = ellipse.getFirstPoint();
        Point secondPoint = ellipse.getSecondPoint();
        if(firstPoint.getY() * secondPoint.getY() <= 0){
            return true;
        }
        return false;
    }

    public boolean crossesVerticalAxe(Ellipse ellipse){
        Point firstPoint = ellipse.getFirstPoint();
        Point secondPoint = ellipse.getSecondPoint();
        if(firstPoint.getX() * secondPoint.getX() <= 0){
            return true;
        }
        return false;
    }
}
