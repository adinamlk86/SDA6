package arrayoperations;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    public static void removeArrayElement(int index, int[] list){
        for(int i=index;i<list.length-1;i++){
            list[i]=list[i+1];
        }
    }

    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original array:"+Arrays.toString(list));

        Scanner in = new Scanner(System.in);
        System.out.println("Insert index of element to be removed:");
        int index = in.nextInt();

        removeArrayElement(index,list);

        System.out.println("Array after element removal:"+Arrays.toString(list));
    }
}
