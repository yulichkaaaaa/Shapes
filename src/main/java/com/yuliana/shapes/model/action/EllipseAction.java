package com.yuliana.shapes.model.action;

import com.yuliana.shapes.model.entity.Ellipse;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class EllipseAction {

    public boolean isEllipse(Ellipse ellipse){
        return ellipse.getFirstPoint().getX() != ellipse.getSecondPoint().getX() &&
                ellipse.getFirstPoint().getY() != ellipse.getSecondPoint().getY();
    }

    public double calculatePerimeter(Ellipse ellipse){
        double a = calculateHorizontalAxe(ellipse) / 2.0;
        double b = calculateVerticalAxe(ellipse) / 2.0;
        double perimeter = 4 * (PI * a * b + pow(2, a - b)) / (a + b);
        return perimeter;
    }

    public double calculateSquare(Ellipse ellipse){
        double a = calculateHorizontalAxe(ellipse) / 2.0;
        double b = calculateVerticalAxe(ellipse) / 2.0;
        double square = PI * a * b;
        return square;
    }

    public boolean isCircle(Ellipse ellipse){
        int horizontalAxe = calculateHorizontalAxe(ellipse);
        int verticalAxe = calculateVerticalAxe(ellipse);
        return horizontalAxe == verticalAxe;
    }

    public boolean isOval(Ellipse ellipse){
        return !isCircle(ellipse);
    }

    private int calculateHorizontalAxe(Ellipse ellipse){
        int x1 = ellipse.getFirstPoint().getX();
        int x2 = ellipse.getSecondPoint().getX();
        int horizontalAxe;
        if(x1 > x2){
            horizontalAxe = x1 - x2;
        }else{
            horizontalAxe = x2 - x1;
        }
        return horizontalAxe;
    }

    private int calculateVerticalAxe(Ellipse ellipse){
        int y1 = ellipse.getFirstPoint().getY();
        int y2 = ellipse.getSecondPoint().getY();
        int verticalAxe;
        if(y1 > y2){
            verticalAxe = y1 - y2;
        }else{
            verticalAxe = y2 - y1;
        }
        return verticalAxe;
    }

}
