package queuestack;

import org.junit.Test;

public class TestNewQueue {

    @Test
    public void testIfNewQueueWorks(){

        NewQueue q1 = new NewQueue(5);
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        q1.insert(5);
        System.out.println(q1.toString());
        q1.remove();
        q1.remove();
        System.out.println(q1.toString());
        q1.insert(6);
        q1.insert(7);
        q1.insert(8);

        System.out.println(q1.toString());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.toString());




    }
}
