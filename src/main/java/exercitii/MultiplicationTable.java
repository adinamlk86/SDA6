package exercitii;

import java.util.Scanner;
//14. Write a program in Java to display the multiplication table of a given integer.

public class MultiplicationTable {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
