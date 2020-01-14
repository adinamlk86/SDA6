package arrayoperations;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] secondArray = new int[8];

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

        System.out.println(Arrays.toString(secondArray));

    }
}
