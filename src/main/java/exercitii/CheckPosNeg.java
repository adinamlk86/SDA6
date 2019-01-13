package exercitii;

import java.util.Scanner;
//1. Write a Java program to get a number from the user and print whether it is positive or negative.

public class CheckPosNeg {

    static void checkNumber(int x){
        if(x<0){
            System.out.println("Number is negative.");
        } else if(x>0){
            System.out.println("Number is positive.");
        } else if(x==0){
            System.out.println("Number is 0.");
        } else {
            System.out.println("Error.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = input.nextInt();
        checkNumber(number);

    }
}
