package stringoperations;

public class CompareStrings {

    public static void compareStrings(String first, String second) {
        int result = first.compareTo(second);

        if (result < 0) {
            System.out.println("First string is less than the second string");
        } else if (result == 0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("First string is greater than the second string");
        }
    }

    public static void compareStringIgnoreCase(String first, String second){
        int result = first.compareToIgnoreCase(second);

        if (result < 0) {
            System.out.println("First string is less than the second string");
        } else if (result == 0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("First string is greater than the second string");
        }
    }

    public static void main(String[] args) {

        String string1 = "This is exercise 1";
        String string2 = "This is Exercise 1";

        compareStrings(string1,string2);
        compareStringIgnoreCase(string1,string2);

        String ex = "example.com";
        String ex2 = "Example.com";
        String charSeq2 = "example.com";

       // System.out.println(ex.contentEquals(charSeq2));
       // System.out.println(ex2.contentEquals(charSeq2));

        StringBuffer strbuff = new StringBuffer(ex);
        System.out.println(ex.contentEquals(strbuff));
        System.out.println(ex2.contentEquals(strbuff));
    }
}
