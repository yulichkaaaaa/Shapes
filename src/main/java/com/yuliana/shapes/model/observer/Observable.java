package com.yuliana.shapes.model.observer;

public interface Observable{
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
