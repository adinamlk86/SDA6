package exercitii;

import java.util.Scanner;
//2. Write a Java program that reads a number in inches, converts it to meters.

public class ConvertInchesToMeters {

    public static double convertInches(double inches){

        double meter = inches*0.0254;
        return meter;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input size in inches: ");
        double inch=in.nextInt();

        double meter= convertInches(inch);
        System.out.println(inch+" inches are equal to "+meter+" meters.");
    }
}
