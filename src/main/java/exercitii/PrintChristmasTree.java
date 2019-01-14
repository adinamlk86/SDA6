package exercitii;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintChristmasTree {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int m=0;m<=3;m++){
            for(int n= 3-m;n>0;n--){
                System.out.print(" ");
            }
            for(int k=0;k<4;k++) {
                System.out.println("*");

            }
        }
    }
}

