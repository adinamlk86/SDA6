package datastructures;

import org.junit.Test;

public class TestMyStack {

    @Test
    public void testIfMyStackWorks() {

        int[] elements = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        MyStack firstStack = new MyStack(10);
        System.out.println(firstStack.toString());

        firstStack.push(1);
        firstStack.push(2);
        firstStack.push(3);
        firstStack.push(4);
        firstStack.push(5);
        firstStack.push(6);
        firstStack.push(7);
        firstStack.push(8);
        firstStack.push(9);
        firstStack.push(10);
         System.out.println(firstStack.toString());

        System.out.println(firstStack.pop());
        System.out.println(firstStack.pop());
        System.out.println(firstStack.pop());
        System.out.println(firstStack.toString());

        firstStack.peak();


    }
}
