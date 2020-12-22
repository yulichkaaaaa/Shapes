package com.yuliana.shapes.parser;

import com.yuliana.shapes.validator.DataValidator;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    private static final String DELIMITER = "\\s";

    public List<Integer> parseEllipseData(String data){
        List<Integer> ellipseCoordinates = new ArrayList<>();
        if(DataValidator.isCorrectEllipse(data)){
            String[] numbers = data.split(DELIMITER);
            for(String number : numbers){
                ellipseCoordinates.add(Integer.parseInt(number));
            }
        }
        return ellipseCoordinates;
    }

}
