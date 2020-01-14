package exercitii;


import java.util.Scanner;

public class PrintRightAngleTriangle {

    /*17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows :
1
22
333
4444*/

    public static void printRightAngleTriangleRepeatNumber(int noOfRows) {
        int n = 1;
        while (n <= noOfRows) {
            for (int i = 1; i <= n; i++) {
                System.out.print(n);
            }
            n++;
            System.out.println();
        }
    }

    //16. Write a program in Java to display the pattern like right angle triangle with a number.
    public static void printRightAngleTriangle(int noOfRows) {

        int n = 1;
        while (n <= noOfRows) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
            }
            n++;
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int noOfRows = in.nextInt();

        printRightAngleTriangle(noOfRows);
        System.out.println();
        printRightAngleTriangleRepeatNumber(noOfRows);


    }
}
