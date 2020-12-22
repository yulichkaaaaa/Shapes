package com.yuliana.shapes.reader;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class CustomFileReaderTest {

    private CustomFileReader fileReader;
    private List<String> lines, defaultLines;
    private static final String CORRECT_FILE_NAME = "data/test.txt";
    private static final String INCORRECT_FILE_NAME = "fwekfhiewfhi";

    @BeforeTest
    private void init(){
        fileReader = new CustomFileReader();
        lines = new ArrayList<>(Arrays.asList("32 12 43 54",
                                              "1 2 4 5",
                                              "12f 32 5 7",
                                              "-1 -3 34 5"));
        defaultLines = new ArrayList<>(Arrays.asList("1 3 5 6",
                                                     "12 3 4 6",
                                                     "0 0 89 90",
                                                     "23 0 9 90",
                                                     "h3 32 23 32",
                                                     "-1 -1 5 5"));
    }

    @Test
    public void readDataCorrectFileNameTest(){
        List<String> actual = fileReader.readData(CORRECT_FILE_NAME);
        assertEquals(actual, lines);
    }

    @Test
    public void readDataIncorrectFileNameTest(){
        List<String> actual = fileReader.readData(INCORRECT_FILE_NAME);
        assertEquals(actual, defaultLines);
    }
}
