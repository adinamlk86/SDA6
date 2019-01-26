package queuestack;

import org.junit.Test;

public class TestReverseQueueToStack {

    @Test
    public void testIfReversingWorks(){

        NewQueue q1 = new NewQueue(5);
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        q1.insert(5);
        System.out.println(q1.toString());

        ReverseQueueToStack test = new ReverseQueueToStack(q1);

        System.out.println(test.reverse());

    }
}
