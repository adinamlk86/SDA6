package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class TestReturnNthElement {

    @Test
    public void testReturnNthElement(){
        ReturnNthElement fibonacciNth = new ReturnNthElement();
        int expectedResult = 8;
        int actualResult = fibonacciNth.getTerm(6);

        Assert.assertEquals(expectedResult,actualResult);


    }
}
