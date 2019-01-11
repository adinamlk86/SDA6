package klargestelement;

public class KLargestElementArray {

    static int returnLargestNumber(int[] lista) {

        int max = lista[0];

        for (int i = 0; i <= lista.length - 1; i++) {
            if (max <= lista[i]) {
                max = lista[i];
            }

        }
        return max;
    }

    static int[] removeAnyNumber(int numberToBeRemoved, int[] initialList) {
        int[] newList = new int[initialList.length - 1];
        int j=0;
        for (int i = 0; i <= initialList.length - 1; i++) {
            if (numberToBeRemoved != initialList[i]) {
                newList[j] = initialList[i];
                j++;
            }
        }
        return newList;
    }


    public static void main(String[] args) {
        int[] lista = {1, 4, 17, 7, 25, 3, 100};
        int noOfMax=3;
        int max;
        for (int i = 0; i <= lista.length - 1; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
        System.out.println();

        for(int m=1;m<=noOfMax;m++) {
            max = returnLargestNumber(lista);
            System.out.println(max);
            lista = removeAnyNumber(max, lista);

        }


    }
}
