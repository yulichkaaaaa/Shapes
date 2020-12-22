package com.yuliana.shapes.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {

    private static final String CORRECT_ELLIPSE_DATA = "^-?\\d+\\s-?\\d+\\s-?\\d+\\s-?\\d+\n$";

    public static boolean isCorrectEllipse(String input){
        Pattern pattern = Pattern.compile(CORRECT_ELLIPSE_DATA);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}
