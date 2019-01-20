package ooppractice.geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestMyPoint {
    @Test
    public void testIfMyPointWorks() {

        MyPoint point1 = new MyPoint(3, 0);
        MyPoint point2 = new MyPoint(0, 4);
        MyPoint point3 = new MyPoint();
        point3.setX(5);
        point3.setY(5);
        MyPoint point4 = new MyPoint();
        point4.setXY(5,5);

        double actual = point1.distance(point2);
        double actual2 = point1.distance(0,4);

        Assert.assertEquals(5, actual, 0.1);
        Assert.assertEquals(5, actual2, 0.1);
        Assert.assertEquals(3, point1.getX(),0.1);
        Assert.assertEquals(0, point2.getX(),0.1);
        Assert.assertEquals(0, point1.getY(),0.1);
        Assert.assertEquals(4, point2.getY(),0.1);


        MyPoint[] points = new MyPoint[10];
        int value = 1;
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(value, value);
            value++;
        }

        for(int j=0;j<points.length;j++){
            System.out.print(points[j].toString()+" ");
        }
    }
}
