package exercitii;

import java.util.Scanner;
//32. Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.
public class CheckFloatingPointNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first number:");
        double a = in.nextDouble();
        System.out.println("Please input second number:");
        double b = in.nextDouble();

        if(Math.abs(a-b)<=0.01){
            System.out.println("Numbers are the same");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
