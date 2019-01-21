package prime;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestPrime {

    @Test
    public void testIfPrimeWorks(){

        Prime test = new Prime();

        boolean a = test.isItPrime(23);
        boolean e = true;

        Assert.assertEquals(e,a);
        Assert.assertEquals(false,test.isItPrime(6));

        Prime numberList = new Prime();

        int[] arr1 = new int[]{1, 2, 3, 5, 7, 10, 12};
        int[] expected = new int[]{2, 3, 5, 7};
        int[] actual = numberList.removeNotPrimeNumbers(arr1);
        System.out.println(Arrays.toString(actual));

        Assert.assertEquals(expected[0],actual[0]);
        Assert.assertEquals(expected[3],actual[3]);
        Assert.assertEquals(expected[2],actual[2]);



    }
}
