package exercitii;

import java.util.Scanner;
//6. Write a Java program to compute body mass index (BMI).

public class BMIndex {


    public static double BMI (float weightInKg, float heightInMeters){

        float bmi= weightInKg/(heightInMeters*heightInMeters);
        return bmi;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Weight in kilograms: ");
        float kg=in.nextInt();
        System.out.println("Height in meters: ");
        float m=in.nextFloat();

        System.out.println("Body mass index is: "+BMI(kg,m));



    }
}
