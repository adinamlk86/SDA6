package exercitii;

import java.util.Scanner;
//8. Write a Java program that takes the user to provide a single character from the alphabet.
// Print Vowel or Consonant, depending on the user input. If the user input is not a letter
// (between a and z or A and Z), or is a string of length > 1, print an error message.

public class CharCheck {

    static void checkLetter(String theLetter) {

        String[] vowels = {"a", "e", "i", "o", "u"};
        boolean isItAVowel = false;
        if(theLetter.matches("\\d")){
            System.out.println("Error. Please input a letter.");
        }

        if (theLetter.length() > 1) {
            System.out.println("Error. Please input a single letter.");
        } else {
            for (int i = 0; i < vowels.length; i++) {

                if (theLetter.contains(vowels[i])) {
                    isItAVowel = true;
                    break;
                }
            }
            if (isItAVowel) {
                System.out.println("Letter is a vowel.");
            } else {
                System.out.println("Letter is a consonant.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a letter: ");
        String letter = input.next();
        checkLetter(letter);

    }
}
