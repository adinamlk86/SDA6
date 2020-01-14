package arrayoperations;

import java.util.Scanner;

public class IsItInTheArray {

    public static boolean checkIfNumberIsInArray(int number, int[] list) {

        for(int n: list){
            if(number == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(checkIfNumberIsInArray(num, list));


    }
}
