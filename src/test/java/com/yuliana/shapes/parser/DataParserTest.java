package com.yuliana.shapes.parser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class DataParserTest {

    private DataParser parser;
    private List<Integer> expected;
    private static final String CORRECT_ELLIPSE_DATA = "12 2 14 7\n";
    private static final String INCORRECT_ELLIPSE_DATA = "12s 2 14 7\n";

    @BeforeTest
    private void init(){
        parser = new DataParser();
        expected = new ArrayList<>(Arrays.asList(12, 2, 14, 7));
    }

    @Test
    public void parseEllipseDataTest(){
        List<Integer> actual = parser.parseEllipseData(CORRECT_ELLIPSE_DATA);
        assertEquals(actual, expected);
    }

    @Test
    public void parseEllipseIncorrectDataTest(){
        List<Integer> actual = parser.parseEllipseData(INCORRECT_ELLIPSE_DATA);
        assertNotEquals(actual, expected);
    }
}
