package exercitii;

import java.util.Scanner;
//2. Write a Java program to solve quadratic equations (use if, else if and else).

public class QuadraticEquation {

    static void quadraticSolve(int a, int b, int c){
//        x = ( −b ± √(b2 − 4ac) )/ 2a.
        double discriminant = b*b - 4*a*c;
        if(discriminant>0){
            double x = (-b + Math.sqrt(discriminant))/(2*a);
            double x2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("X is: "+x+" and also: "+x2);
        } else if (discriminant==0){
            double x = -b/(2*a);
            System.out.println("X is: "+x);
        } else {
            System.out.println("I don't know :)");
        }

    }

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a=input.nextInt();
        System.out.println("Input b: ");
        int b=input.nextInt();
        System.out.println("Input c: ");
        int c=input.nextInt();

        quadraticSolve(a,b,c);

    }
}
