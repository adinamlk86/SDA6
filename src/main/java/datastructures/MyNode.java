package datastructures;

public class MyNode {

    private int data;
    private MyNode next;

    public MyNode(int data) {
        this.data = data;
    }

    public void insertNode(MyNode newNode){

        if(next == null){
            next = newNode;
        } else {
            next.insertNode(newNode);
        }
    }

    public int countNodes(MyNode head){
        int counter = 0;
        MyNode current = head;
        while(current.next!=null){
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void printList(){
        System.out.print(data+" ");
        if(next!=null){
            next.printList();
        }

    }

    public int getNodeData(int index) {

        if (index == 0) {
            return data;
        } else {
            if (next == null) {
                return 111111;
            } else {
                return next.getNodeData(index - 1);
            }
        }
    }

    public MyNode getNext(){
        return next;
    }

    public void removeNode(int index){

        if(index==1){
            next=next.getNext();
        } else {
            next.removeNode(index-1);
        }
    }







}
