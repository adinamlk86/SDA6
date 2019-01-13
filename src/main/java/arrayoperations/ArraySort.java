package arrayoperations;
//1. Write a Java program to sort a numeric array and a string array.

public class ArraySort {


    static void sortListNumbers(int[] listToBeOrdered){

        for (int i = 0; i < listToBeOrdered.length; i++) {
            for (int j = 0; j < listToBeOrdered.length; j++) {
                if (listToBeOrdered[i] < listToBeOrdered[j]) {
                    int tempElement = listToBeOrdered[i];
                    listToBeOrdered[i] = listToBeOrdered[j];
                    listToBeOrdered[j] = tempElement;
                }
            }
        }
        System.out.println("Ordered number list: ");

        for(int i=0;i<listToBeOrdered.length;i++){
            System.out.print(listToBeOrdered[i]+" ");
        }
    }

    static void sortListString(String[] listToBeOrdered){

        for (int i = 0; i < listToBeOrdered.length; i++) {
            for (int j = i+1; j < listToBeOrdered.length; j++) {
                if (listToBeOrdered[i].compareTo(listToBeOrdered[j])>0) {
                    String tempElement = listToBeOrdered[i];
                    listToBeOrdered[i] = listToBeOrdered[j];
                    listToBeOrdered[j] = tempElement;
                }
            }
        }
        System.out.println("Ordered string list: ");

        for(int i=0;i<listToBeOrdered.length;i++){
            System.out.print(listToBeOrdered[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[]listNumbers = {9,3,8,2,7,5,6,4,1};
        String[] listString = {"g","a","h","e","b","d","c","f"};
        sortListNumbers(listNumbers);
        System.out.println();
        sortListString(listString);






    }
}
