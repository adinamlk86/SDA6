package datastructures;

import org.junit.Assert;
import org.junit.Test;

public class TestMyNode {

    @Test
    public void testIfMyNodeWorks() {

        MyNode head = new MyNode(6);
        MyNode nodeB = new MyNode(3);
        MyNode nodeC = new MyNode(4);
        MyNode nodeD = new MyNode(2);
        MyNode nodeE = new MyNode(1);

        head.insertNode(nodeB);
        head.insertNode(nodeC);
        head.insertNode(nodeD);
        head.insertNode(nodeE);

        head.printList();
        System.out.println();

        Assert.assertEquals(4, head.countNodes(head));
        Assert.assertEquals(2, head.countNodes(nodeC));
        Assert.assertEquals(1, nodeD.countNodes(nodeD));

        Assert.assertEquals(1, head.getNodeData(4));
        Assert.assertEquals(6, head.getNodeData(0));
        Assert.assertEquals(4, head.getNodeData(2));

       head.removeNode(4);
       head.printList();

        System.out.println();
        head = head.getNext();
        head.printList();



    }
}
