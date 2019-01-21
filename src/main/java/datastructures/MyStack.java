package datastructures;

import java.util.Arrays;

public class MyStack {

    private int top; //index of the last element added;
    private int[] elements; // a place to store the data;
    private int size; // size of elements array;

    public MyStack(int size) {
        this.top = -1;
        this.size = size;
        this.elements = new int[size];
    }

    //toString() - prints the stack ( return Arrays.toString(elements)

    @Override
    public String toString() {
        return "MyStack:" +
                "top=" + top +
                ", elements=" + Arrays.toString(elements) +
                ", size=" + size;
    }

    // push () - adds element to stack

    public void push(int elementToBeAdded) {

            elements[++top] = elementToBeAdded;


    }
    // pop() - removes last element added from stack and returns it

    public int pop() {

        int last = elements[top];
        elements[top] = 0;
        top--;

        return last;
    }

    //peak() = displays element at the top of the stack;

    public void peak() {
        System.out.println(elements[top]);
    }
}
