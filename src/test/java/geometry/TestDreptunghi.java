package geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestDreptunghi {

    @Test
    public void testIfDreptunghiWorks(){

        Dreptunghi d1=new Dreptunghi(4,2);

        Assert.assertEquals(4,d1.getLungime());
        Assert.assertEquals(2,d1.getLatime());
        Assert.assertEquals(8,d1.calculeazaArie());
        Assert.assertEquals(12,d1.calculeazaPerimetru());

    }
}
