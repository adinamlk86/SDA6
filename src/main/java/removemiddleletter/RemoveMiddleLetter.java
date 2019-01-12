package removemiddleletter;

public class RemoveMiddleLetter {

    static void displayMiddleChar(String testString) {
        int length = testString.length();
        if (length % 2 != 0) {
            System.out.println(testString.charAt(length / 2));
        } else {
            char c1 = testString.charAt(length / 2);
            char c2 = testString.charAt(length / 2 - 1);
            System.out.println(String.valueOf(c2) + String.valueOf(c1));

        }
    }

    public static void main(String[] args) {
        String expresie = "aabaa";

       displayMiddleChar(expresie);


    }



}
