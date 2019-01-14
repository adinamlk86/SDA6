package stringoperations;

import java.util.Scanner;

public class HowManyWordsInString {


    static int countWords(String sentence){

        int counter = 1;
        char space = ' ';

        for(int i=0;i<sentence.length();i++){
            char currentLetter = sentence.charAt(i);
           if(currentLetter==space){
               counter ++;
            }
        }
        return counter;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input string:");
        String expression = input.nextLine();

     //   String expression = "Mama are mere";

        int wordCounter = countWords(expression);
        System.out.println(wordCounter);


    }
}
