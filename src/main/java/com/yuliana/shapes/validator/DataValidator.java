package com.yuliana.shapes.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {

    private static final String VALID_INPUT = "^-?\\d+\\s-?\\d+\\s-?\\d+\\s-?\\d+$";

    public static boolean isCorrectEllipse(String input){
        Pattern pattern = Pattern.compile(VALID_INPUT);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}
