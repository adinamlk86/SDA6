package klargestelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class KlargestElement {


    public static void findLargestKElements(ArrayList<Integer> x) {

        Collections.sort(x);
        System.out.println(x);
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num;
        if (in.hasNextInt()) {
            num = in.nextInt();
            int counter = 0;
            if (num > x.size()) {
                System.out.println("Error: Input larger than list size.");
            } else {
                for (int i = x.size() - 1; i > 0; i--) {
                    if (counter != num) {
                        System.out.println(x.get(i));
                        counter++;
                    }
                }
            }

        } else {
            System.out.println("Error: Please input a number.");
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        lista.add(1);
        lista.add(4);
        lista.add(17);
        lista.add(7);
        lista.add(25);
        lista.add(3);
        lista.add(100);

        System.out.println(lista);
        findLargestKElements(lista);


    }

}