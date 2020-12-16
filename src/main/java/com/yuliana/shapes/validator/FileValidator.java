package com.yuliana.shapes.validator;

import java.io.File;

public class FileValidator {

    public static boolean isFileValid(String fileName){
        File file = new File(fileName);
        return file.isFile() && !(file.length() == 0);
    }

}
