package com.yuliana.shapes.model.observer;

import com.yuliana.shapes.model.entity.Ellipse;

import java.util.EventObject;

public class EllipseEvent extends EventObject {

    public EllipseEvent(Ellipse source){
        super(source);
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }
}
