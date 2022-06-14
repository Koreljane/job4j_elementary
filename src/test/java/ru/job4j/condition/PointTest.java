package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distancewhen00to20then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distancewhen03to00then3() {
        double expected = 3;
        int x1 = 0;
        int x2 = 3;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distancewhen30to30then4() {
        double expected = 4.24;
        int x1 = 3;
        int x2 = 0;
        int y1 = 3;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distancewhen49to35then5dot38() {
        double expected = 5.38;
        int x1 = 4;
        int x2 = 9;
        int y1 = 3;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}