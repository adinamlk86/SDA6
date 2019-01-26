package queuestack;

import java.util.Arrays;

public class NewQueue {

    private int size;
    private int[] elements;
    private int front;
    private int rear;

    public NewQueue(int size) {
        this.size = size;
        this.elements= new int[size];
        this.front=0;
        this.rear=-1;
    }

    public void insert(int newElement){

        if(rear==size-1){
            rear=-1;
        }
        elements[++rear]=newElement;

    }

    public void setFront(int front) {
        this.front = front;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int remove(){
        int temp = elements[front];
        elements[front++]=0;
        if(front==size){
            front=0;
        }

        return temp;
    }

    @Override
    public String toString() {
        return "NewQueue:" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                ", front=" + front +
                ", rear=" + rear;
    }

    public int getSize() {
        return size;
    }

    public int getFront() {
        return front;
    }

    public int getFrontElement(){
        return elements[front];
    }

    public int getRear() {
        return rear;
    }

    public int getRearElement(){
        return elements[rear];
    }

    public boolean isItFull(){
        boolean full = false;
        if(front==rear-1){
            full=true;
        }
        return full;
    }
}
