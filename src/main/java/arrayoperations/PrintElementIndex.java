package arrayoperations;

import java.util.Scanner;

public class PrintElementIndex {

    public static void returnIndex(String a, String[] list){
        if(list == null)
            System.out.println("List is empty");

        int length = list.length;
        int i=0;
        boolean isIt = false;
        while(i<length){
            if(list[i].equals(a)){
                System.out.println("Element index is: " + i);
                isIt = true;
                break;
            } else
                i++;
        }
        if(isIt == false){
            System.out.println("Element not in list");
        }
    }

    public static void main(String[] args) {

        String[] list = {"a","b","c","d","e","f","g"};

        Scanner in = new Scanner(System.in);
        System.out.println("Input element:");
        String x = in.nextLine();

        returnIndex(x,list);

    }
}
