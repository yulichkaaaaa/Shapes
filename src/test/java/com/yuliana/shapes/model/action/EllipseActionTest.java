package com.yuliana.shapes.model.action;

import com.yuliana.shapes.model.action.EllipseAction;
import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.entity.Point;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class EllipseActionTest {

    public final static double DELTA = 0.0001;
    private Ellipse oval, circle;
    private EllipseAction ellipseAction;

    @BeforeTest
    private void init(){
        circle = new Ellipse(new Point(3, 3), new Point(6, 6));
        oval = new Ellipse(new Point(-1, -1), new Point(2, 3));
        ellipseAction = new EllipseAction();
    }

    @Test
    public void isEllipseTest(){
        boolean condition = ellipseAction.isEllipse(oval);
        assertTrue(condition);
    }

    @Test
    public void isNotOvalTest(){
        boolean condition = ellipseAction.isOval(circle);
        assertFalse(condition);
    }

    @Test
    public void isOvalTest(){
        boolean condition = ellipseAction.isOval(oval);
        assertTrue(condition);
    }

    @Test
    public void isNotCircleTest(){
        boolean condition = ellipseAction.isCircle(oval);
        assertFalse(condition);
    }

    @Test
    public void isCircleTest(){
        boolean condition = ellipseAction.isCircle(circle);
        assertTrue(condition);
    }

    @Test
    public void calculatePerimeterTest(){
        double actual = ellipseAction.calculatePerimeter(oval);
        double expected = 11.5793;
        assertEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateSquareTest(){
        double actual = ellipseAction.calculateSquare(oval);
        double expected = 9.42478;
        assertEquals(actual, expected, DELTA);
    }
}
