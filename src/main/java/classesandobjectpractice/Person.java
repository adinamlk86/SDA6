package classesandobjectpractice;

public class Person {

    private int age;
    private String name;
    private String sex;
    private String stareCivila;
    private String numePartener;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", stareCivila='" + stareCivila + '\'' +
                ", numePartener='" + numePartener + '\'' +
                '}';
    }

    public Person(String name, String numePartener) {
        this.name = name;
        this.numePartener = numePartener;
    }

    public Person(int age, String name, String sex, String stareCivila) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.stareCivila = stareCivila;
    }

    public String getStareCivila() {
        return stareCivila;
    }

    public Person(int age, String name, String sex, String stareCivila, String numePartener) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.stareCivila = stareCivila;
        this.numePartener = numePartener;
    }

    public void setStareCivila(String stareCivila) {
        this.stareCivila = stareCivila;
    }

    public String getNumePartener() {
        return numePartener;
    }

    public void setNumePartener(String numePartener) {
        this.numePartener = numePartener;
    }

    public Person(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
