package classesandobjectpractice;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
@Test
    public void testIfPersonWorks() {

        Person p1 = new Person(32, "Ana", "F", "married", "Roberto");
        Person p2 = new Person(30, "George", "M", "married","Gabriela");
        Person p3 = new Person(36, "Valentin", "M","single");
        Person p4 = new Person(45, "Radu", "M", "single");
        Person p5 = new Person(18, "Andreea", "F","single");

        Person expected = new Person(32, "Ana", "F","married","Roberto");


        Assert.assertEquals(expected.getAge(),p1.getAge());
        Assert.assertEquals(expected.getName(),p1.getName());
    //System.out.println(p1.toString());
    }
}