package exercitii;

import java.util.Scanner;
//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.

public class ConvertFahrenheitToCelsius {

    public static double convert(double degreesInF){
        double degreesInC = (degreesInF-32)/1.8;
        return degreesInC;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input Fahrenheit temperature: ");
        double degrees=in.nextInt();

        double newTemp = convert(degrees);

        System.out.println(degrees+" degrees Fahrenheit are equal to "+newTemp+" degrees Celsius.");
    }
}
