package com.yuliana.shapes.model.warehouse;

import com.yuliana.shapes.exception.WarehouseException;
import com.yuliana.shapes.model.entity.EllipseProperty;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class EllipsePropertyWarehouse {

    public final static EllipsePropertyWarehouse warehouse = new EllipsePropertyWarehouse();
    private Map<Long, EllipseProperty> ellipsePropertyMap;

    private EllipsePropertyWarehouse() {
        ellipsePropertyMap = new HashMap<>();
    }

    public void addProperty(long ellipseId, EllipseProperty property) throws WarehouseException{
        if(!ellipsePropertyMap.containsKey(ellipseId)) {
            ellipsePropertyMap.put(ellipseId, property);
        }else{
            throw new WarehouseException();
        }
    }

    public EllipseProperty getProperty(long ellipseId){
        return  ellipsePropertyMap.get(ellipseId);
    }

    public void updateProperty(long ellipseId, EllipseProperty property) throws WarehouseException{
        if(ellipsePropertyMap.containsKey(ellipseId)) {
            ellipsePropertyMap.put(ellipseId, property);
        }else{
            throw new WarehouseException();
        }
    }

    public void removeProperty(long ellipseId) throws WarehouseException {
        if(!ellipsePropertyMap.containsKey(ellipseId)){
            throw new WarehouseException();
        }
        ellipsePropertyMap.remove(ellipseId);
    }

}
