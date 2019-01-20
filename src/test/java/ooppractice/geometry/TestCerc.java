package ooppractice.geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestCerc {

    @Test
    public void testIfCercWorks(){

        Cerc c1=new Cerc(5);

        Assert.assertEquals(78.5398,c1.calculeazaAria(),0.1);
        Assert.assertEquals(31.4159,c1.calculeazaCircumferinta(),0.1);
    }
}
