package exercitii;

import java.util.Scanner;
//3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

public class DigitsSum {
    public static void main(String[] args) {



        Scanner in=new Scanner(System.in);
        System.out.println("Input a number between 1 and 1000: ");
        int number=in.nextInt();
        int digitSum=0;

        if(number>0 && number<1000){
            while(number!=0) {
                digitSum = digitSum + (number% 10);
                number=number/10;
            }
            System.out.println("Sum of digits is: "+digitSum);
        }else {
            System.out.println("Error. Please input a number between 1 and 1000.");
        }


    }
}
