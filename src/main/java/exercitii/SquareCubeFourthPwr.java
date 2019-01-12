package exercitii;

import java.util.Scanner;
//8. Write a Java program that reads a number and display the square, cube, and fourth power

public class SquareCubeFourthPwr {
    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        System.out.println("Input number: ");
        int number=in.nextInt();
        int square=number*2;
        System.out.println("Square is: " + square );
        int cube=square*number;
        System.out.println("Cube is: "+ cube);
        int fourth=cube*number;
        System.out.println("Fourth power is: "+ fourth);

    }
}
