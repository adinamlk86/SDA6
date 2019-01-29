package datastructures;

public class MyLinkedList {

    private MyNode head;

    public MyLinkedList(MyNode head) {
        this.head = head;
    }



    public void insertBeforeHead(int data){

        MyNode newHead = new MyNode(data);
        newHead.next=head;
        this.head=newHead;

    }

    public void insertLast(int data){

        MyNode newNode = new MyNode(data);
        MyNode lastNode = head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }

    public void insertAfter(MyNode nodeToAddAfter, int data){ // insert element after specified node

        if(listContains(nodeToAddAfter)){
            MyNode newNode = new MyNode(data);
            newNode.next = nodeToAddAfter.next;
            nodeToAddAfter.next= newNode;

        } else {
            System.out.println("Node "+ nodeToAddAfter+ " does not exist.");
        }


    }

    public void printList(){
        MyNode currentNode = head;

        while(currentNode !=null){
            System.out.print(currentNode.data +" ");
            currentNode=currentNode.next;
        }
    }


    public boolean listContains(MyNode node){

        boolean contains = false;
        MyNode position = head;
        while(position!=null && position.data!=node.data){
            position=position.next;
        }
        if(position!=null){
            contains=true;
        }

        return contains;
    }


}
