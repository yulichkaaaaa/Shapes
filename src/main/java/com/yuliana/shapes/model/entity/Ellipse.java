package com.yuliana.shapes.model.entity;

import com.yuliana.shapes.model.observer.EllipseEvent;
import com.yuliana.shapes.model.observer.Observable;
import com.yuliana.shapes.model.observer.Observer;
import com.yuliana.shapes.model.observer.impl.EllipseSquareObserver;

import java.util.ArrayList;
import java.util.List;

public class Ellipse extends Shape2D implements Observable {

    private long ellipseId;
    private Point firstPoint;
    private Point secondPoint;
    private List<Observer> observers = new ArrayList<>();

    public Ellipse(long ellipseId, Point firstPoint, Point secondPoint) {
        this.ellipseId = ellipseId;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Ellipse(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Ellipse(){}

    public long getEllipseId() {
        return ellipseId;
    }

    public void setEllipseId(long ellipseId) {
        this.ellipseId = ellipseId;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        notifyObservers();
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        notifyObservers();
        this.secondPoint = secondPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return ellipseId == ellipse.ellipseId &&
                firstPoint.equals(ellipse.firstPoint) &&
                secondPoint.equals(ellipse.secondPoint);
    }

    @Override
    public int hashCode() {
        int result = 31 * firstPoint.hashCode();
        result = 31 * result * secondPoint.hashCode();
        result = 31 * result * (int)ellipseId;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ellipse{");
        sb.append("ellipseId=").append(ellipseId);
        sb.append(", firstPoint=").append(firstPoint);
        sb.append(", secondPoint=").append(secondPoint);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void attach(Observer observer) {
        if(observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        EllipseEvent event = new EllipseEvent(this);
        observers.forEach(observer -> observer.parameterChanged(event));
    }
}
