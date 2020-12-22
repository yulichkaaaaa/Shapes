package com.yuliana.shapes.model.action;

import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.entity.Point;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EllipseCoordinatesActionTest {

    private Ellipse ellipse;
    private EllipseCoordinatesAction action;

    @BeforeTest
    private void init(){
        ellipse = new Ellipse(new Point(3, -3), new Point(6, 6));
        action = new EllipseCoordinatesAction();
    }

    @Test
    public void crossesHorizontalAxeTest(){
        boolean condition = action.crossesHorizontalAxe(ellipse);
        assertTrue(condition);
    }

    @Test
    public void crossesVerticalAxeTest(){
        boolean condition = action.crossesVerticalAxe(ellipse);
        assertFalse(condition);
    }
}
