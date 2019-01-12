package exercitii;

import java.util.Scanner;
//4. Write a Java program to convert minutes into a number of years and days.

public class ConvertMinutesToYearsAndDays {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduceti numarul de minute: ");
        int minute=in.nextInt();

        int ani = (int) (minute * 0.000002);
        int zile;
        zile = (int) ((minute-(ani*525960))*0.000694);


        System.out.println(ani+" ani si "+zile+" zile.");

    }
}
