package com.yuliana.shapes.model.observer.impl;

import com.yuliana.shapes.exception.WarehouseException;
import com.yuliana.shapes.model.action.EllipseAction;
import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.entity.EllipseProperty;
import com.yuliana.shapes.model.observer.EllipseEvent;
import com.yuliana.shapes.model.observer.Observer;
import com.yuliana.shapes.model.warehouse.EllipsePropertyWarehouse;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EllipsePerimeterObserver implements Observer {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterChanged(EllipseEvent event) {
        Ellipse ellipse = (Ellipse) event.getSource();
        long ellipseId = ellipse.getEllipseId();
        EllipseAction action = new EllipseAction();
        double perimeter = action.calculatePerimeter(ellipse);
        EllipseProperty property = EllipsePropertyWarehouse.warehouse.getProperty(ellipseId);
        property.setPerimeter(perimeter);
        try {
            EllipsePropertyWarehouse.warehouse.updateProperty(ellipse.getShapeId(), property);
        }catch (WarehouseException e){
            logger.error(e.getMessage(), Level.ERROR);
        }
    }
}
