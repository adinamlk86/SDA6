package exercitii;

import java.util.Calendar;

//5. Write a Java program that prints the current time and date.
public class PrintCurrentTime {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("Current date and time:");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);

    }
}
