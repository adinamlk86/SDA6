package ooppractice.geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestCircle {

    @Test
    public void testIfCircleWorks(){

        Circle c1 = new Circle(5);
        Assert.assertEquals(78.53,c1.getArea(),0.1);
        Circle c2 = new Circle(5,"green");

        Assert.assertEquals("green",c2.getColour());

        Circle c3=new Circle();

        Assert.assertEquals(1.0,c3.getRadius(),0.1);
        Assert.assertEquals("red",c3.getColour());

        c3.setColour("blue");
        c3.setRadius(4);
        Assert.assertEquals("blue", c3.getColour());
        Assert.assertEquals(4,c3.getRadius(),0.1);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());


    }
}
