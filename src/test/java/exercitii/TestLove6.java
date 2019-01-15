package exercitii;

import org.junit.Assert;
import org.junit.Test;

public class TestLove6 {

    @Test
    public void testIfLove6WorksRight(){
        Love6 test = new Love6();
        boolean x = true;
        boolean y = test.checkLove(4,2);

        Assert.assertEquals(x,y);

        Assert.assertEquals(true, test.checkLove(3,3));
        Assert.assertEquals(false, test.checkLove(7,3));
        Assert.assertEquals(true, test.checkLove(2,8));
    }
}
