package exercitii;

import java.util.Scanner;

public class NumberOfDigitsInInteger {

    public static int countNumberOfDigits(int number){
        int counter = 0;
        while(number%10!=0){
            counter++;
            number = number/10;
        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input an integer smaller than 10 billion:");
        int n = in.nextInt();

        System.out.print(countNumberOfDigits(n));


    }
}
