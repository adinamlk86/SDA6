package datastructures;

import org.junit.Test;

public class TestMyLinkedList {

    @Test
    public void testIfMyLinkedListWorks(){

        MyNode head = new MyNode(1);

        MyLinkedList linkedList = new MyLinkedList(head);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
        linkedList.insertLast(4);
        linkedList.insertLast(5);
        linkedList.insertLast(6);
        linkedList.printList();

        System.out.println();
        linkedList.insertAfter(head,10);
        linkedList.printList();

        System.out.println();
        linkedList.insertBeforeHead(65);
        linkedList.printList();
        System.out.println();
        MyNode randomNode = new MyNode(6);
        MyNode randomNode2 = new MyNode(999);
        boolean a= linkedList.listContains(randomNode);
        System.out.println(a);
        a=linkedList.listContains(randomNode2);
        System.out.println(a);







    }
}
