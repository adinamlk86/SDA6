package stringoperations;

public class ReplaceInString {

    public static void main(String[] args) {

        String string = "The quick brown fox jumps over the lazy dog.";
        String newString = string.replace('d','f');
        String newString2 = string.replace("fox", "cat");

        System.out.println(newString);
        System.out.println(newString2);

    }
}
