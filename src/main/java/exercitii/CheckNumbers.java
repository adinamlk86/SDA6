package exercitii;

import java.util.Scanner;

public class CheckNumbers {

    public static void checkNumbers(int a, int b, int c){
        if(a==b && b==c){
            System.out.println("All numbers are equal.");
        } else if (a!=b && b!=c){
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Neither are equal or different.");
        }
    }

    public static void checkIncreasingNumbers(int a, int b, int c){
        if(b>a && c>b){
            System.out.println("Increasing");
        } else if(b<a && c<b){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first number:");
        int n1 = in.nextInt();
        System.out.println("Please input first number:");
        int n2 = in.nextInt();
        System.out.println("Please input first number:");
        int n3 = in.nextInt();

        //checkNumbers(n1,n2,n3);
        checkIncreasingNumbers(n1,n2,n3);



    }
}
