package exercitii;

import java.util.Scanner;
//5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7
// and displays the name of the weekday.

public class DayOfTheWeek {

    static void checkDay(int numberOfDay) {

        String dayOfWeek;
        switch (numberOfDay) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid input";
                break;
        }

        System.out.println(dayOfWeek);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input number between 1 and 7: ");
        int day = input.nextInt();
        checkDay(day);

    }
}
