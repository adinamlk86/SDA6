package queuestack;

import java.util.Arrays;

public class NewStack {

    private int top;
    private int[] elements;
    private int size;

    public NewStack(int size) {
        this.top=-1;
        this.size = size;
        this.elements= new int[size];
    }
    public boolean isItFull(){
        boolean full = false;
        if(top==size-1){
            full=true;
        }
        return full;
    }


    public void push(int newElement){
        if(top==size-1){
            System.out.println("Stack is full");
        } else {

            elements[++top] = newElement;
        }
    }

    public void pop(){

        elements[top]=0;
        top--;
    }

    @Override
    public String toString() {
        return "Stack: " +
                "top=" + top +
                ", elements=" + Arrays.toString(elements) +
                ", size=" + size;
    }
}
