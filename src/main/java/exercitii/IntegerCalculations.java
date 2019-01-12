package exercitii;

import java.util.Scanner;
//9. Write a Java program that accepts two integers from the user and then prints the sum, the difference,
// the product, the average, the distance (the difference between integer), the maximum (the larger of the
// two integers), the minimum (smaller of the two integers).

public class IntegerCalculations {

    static int sumOfIntegers(int a, int b){
        return a+b;
    }

    static int differenceOfIntegers(int a,int b){
        return a-b;
    }

    static int productOfIntegers(int a, int b){
        return a*b;
    }

    static float averageOfIntegers(int a, int b){

        float average = (float) (a+b)/2;
        return average;
    }

    static int maximum (int a, int b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }

    static int minimum (int a, int b){
        if(a<b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int first = in.nextInt();
        System.out.println("Input second integer: ");
        int second = in.nextInt();

        System.out.println("Sum is: "+ sumOfIntegers(first,second));
        System.out.println("Difference is: "+ differenceOfIntegers(first,second));
        System.out.println("Product is: "+productOfIntegers(first,second));
        System.out.println("Average is: "+averageOfIntegers(first,second));
        System.out.println("Maximum is: "+ maximum(first,second));
        System.out.println("Minimum is: "+ minimum(first,second));

    }
}
