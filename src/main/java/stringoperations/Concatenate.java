package stringoperations;

public class Concatenate {
    public static void main(String[] args) {
        String first = "PHP Exercises and ";
        String second = "Python Exercises";

        String last = first.concat(second);
        System.out.println(last);
        System.out.println(first + second);
    }
}
