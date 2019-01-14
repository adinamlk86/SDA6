package arrayoperations;

public class VariousArrayPractice {

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void printArrayBackwards(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static void printOddIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]+ " ");
            }
        }
    }

    static void printIntegersDivBy3(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i]+ " ");
            }
        }
    }

    static void sumOfIntegers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println("Sum of all the integers: "+sum);
    }

    static void sumOfFirst4(int[] array){
        int sum = 0;
        int counter =0;
            for (int i = 0; i < array.length; i++) {
                if (counter<4) {
                    sum = sum + array[i];
                }
                counter++;
            }
        System.out.println("Sum of first 4 integers: "+sum);
    }

    static void sumOfLast5(int[] array){
        int sum=0;
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--){
            if(counter!=5 && array[i]>2){
                sum+=array[i];
                counter++;
            }
        }
        System.out.println("Sum of last 5 integers bigger than 2: "+sum);
    }

    static void howManyNumbers(int[] array){
        int sum=0;
        int counter=0;
        for(int i=0; i<=array.length;i++){
            if(sum<=11){
                sum+=array[i];
                counter++;
            }
        }
        System.out.println(counter+" numbers added until their sum is bigger than 10.");
    }


    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,1, 10};

        System.out.println("a) ");
        printArray(integerArray);
        System.out.println();

        System.out.println("b) ");
        printArrayBackwards(integerArray);
        System.out.println();

        System.out.println("c) ");
        printOddIntegers(integerArray);
        System.out.println();

        System.out.println("d) ");
        printIntegersDivBy3(integerArray);
        System.out.println();

        System.out.println("e) ");
        sumOfIntegers(integerArray);
        System.out.println();

        System.out.println("f) ");
        sumOfFirst4(integerArray);
        System.out.println();

        System.out.println("g) ");
        sumOfLast5(integerArray);
        System.out.println();

        System.out.println("h) ");
        howManyNumbers(integerArray);
        System.out.println();

    }
}
