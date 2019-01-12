package exercitii;

import java.util.Scanner;
//10. Write a Java program to break an integer into a sequence of individual digits.

public class PrintNumberIndividualDigits {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = in.nextInt();
        int power =1;

        while(power<=number){
            power=power*10;
        }
        power=power/10;

        while(power>0){
            System.out.print(number/power+" ");
            number = number%power;
            power=power/10;
        }
    }
}
