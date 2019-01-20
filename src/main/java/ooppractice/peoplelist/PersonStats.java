package ooppractice.peoplelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonStats {

    private Person[] people;

    public PersonStats(Person[] people) {
        this.people = people;
    }

    //oldest woman
    public String oldestWoman() {
        int max = 0;
        Person name = new Person(0, "default", "N");
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSex() == "F") {
                if (max <= people[i].getAge()) {
                    max = people[i].getAge();
                    name.setName(people[i].getName());
                }
            }
        }
        return name.getName();
    }

    //oldest man
    public String oldestMan() {
        int max = 0;
        Person name = new Person(0, "default", "N");
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSex() == "M") {
                if (max <= people[i].getAge()) {
                    max = people[i].getAge();
                    name.setName(people[i].getName());
                }
            }
        }
        return name.getName();
    }
    //woman count

    public int countWomen() {
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSex().equals("F")) {
                counter++;
            }
        }
        return counter;
    }

    // man count

    public int countMen() {
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSex().equals("M")) {
                counter++;
            }
        }
        return counter;
    }

    //average man age
    public int averageMenAge() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSex().equals("M")) {
                sum += people[i].getAge();
                counter++;
            }

        }
        int average = sum / counter;

        return average;
    }

    // average woman age

    public int averageWomenAge() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getSex().equals("F")) {
                sum += people[i].getAge();
                counter++;
            }

        }
        int average = sum / counter;

        return average;
    }

    //number of married people

    public int countMarriedPeople() {
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getStareCivila().equals("married")) {
                counter++;
            }
        }
        return counter;
    }

    //print husband and wife

    public  List<Person> printCouples(){
        List<Person> couples = new ArrayList<>();
        for(int i=0;i<people.length;i++){
            if(people[i].getStareCivila().equals("married")){
                Person temporary= new Person("default", "default");
                temporary.setName(people[i].getName());
                temporary.setNumePartener(people[i].getNumePartener());
                couples.add(temporary);

            }
        }
        return couples;
    }

    @Override
    public String toString() {
        return "PersonStats{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
