package exercitii;

import java.util.Scanner;
//3. Take three numbers from the user and print the greatest number.

public class CheckGreatestNumber {

    static void checkGreatestNumber(int a, int b, int c){
        int max;
        if(a>b){
            max=a;
        } else{
            max=b;
        }

        if(max>c){
            System.out.println("Greatest number is: "+max);
        } else {
            System.out.println("Greatest number is: "+c);
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = input.nextInt();
        System.out.println("Input second number: ");
        int second = input.nextInt();
        System.out.println("Input third number: ");
        int third = input.nextInt();

        checkGreatestNumber(first,second,third);
    }
}
