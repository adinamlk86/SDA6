package ooppractice.geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestMyTriangle {

    @Test
    public void testIfMyTriangleWorks() {


        MyTriangle t1 = new MyTriangle(5, 5, 10, 10, 1, 1);
        System.out.println(t1.toString());
        Assert.assertEquals(25.45, t1.getPerimeter(), 0.1);
        Assert.assertEquals("scalene",t1.printType());


        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(8, 0);
        MyPoint p3 = new MyPoint(4, 7);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        Assert.assertEquals("equilateral",t2.printType());

        MyTriangle t3 = new MyTriangle(0, 0, 8, 0, 4, 10);
        Assert.assertEquals("isosceles",t3.printType());


    }
}
