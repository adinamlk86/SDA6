package queuestack;

import org.junit.Assert;
import org.junit.Test;

public class TestNewStack {

    @Test
    public void testIfNewStackWorks(){

        NewStack s1= new NewStack(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1.toString());
        s1.pop();
        s1.pop();
        System.out.println(s1.toString());
        s1.push(6);
        s1.push(7);
        s1.push(8);
        System.out.println(s1.toString());

        Assert.assertEquals(true, s1.isItFull());
        s1.pop();
        Assert.assertEquals(false, s1.isItFull());




    }
}
