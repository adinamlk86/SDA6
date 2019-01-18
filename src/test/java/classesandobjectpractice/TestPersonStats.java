package classesandobjectpractice;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestPersonStats {
    @Test
    public void testIfPersonStatsWorks(){

        Person p1 = new Person(32, "Ana", "F", "married", "Roberto");
        Person p2 = new Person(30, "George", "M", "married","Gabriela");
        Person p3 = new Person(36, "Valentin", "M","single");
        Person p4 = new Person(45, "Radu", "M", "single");
        Person p5 = new Person(18, "Andreea", "F","single");

        Person[] people = new Person[]{p1,p2,p3,p4,p5};

        PersonStats peopleList = new PersonStats(people);

        Assert.assertEquals("Ana",peopleList.oldestWoman());
        Assert.assertEquals("Radu",peopleList.oldestMan());
        Assert.assertEquals(2,peopleList.countWomen());
        Assert.assertEquals(3,peopleList.countMen());
        Assert.assertEquals(37,peopleList.averageMenAge());
        Assert.assertEquals(25,peopleList.averageWomenAge());
        Assert.assertEquals(2,peopleList.countMarriedPeople());

        List<Person> actual = peopleList.printCouples();
        Assert.assertEquals("AnaRoberto", actual.get(0).getName() + actual.get(0).getNumePartener());
        Assert.assertEquals("GeorgeGabriela", actual.get(1).getName() + actual.get(1).getNumePartener());
        System.out.println(peopleList.toString());
    }



}
