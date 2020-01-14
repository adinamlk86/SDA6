package stringoperations;

public class GetCharIndexInString {
    public static void main(String[] args) {
        String string = "Java Exercises";

        String string2 = "w3resource.com";

        System.out.println("The character at position 0 is: "+ string.charAt(0));
        System.out.println("The character at position 9 is: "+ string.charAt(9));

        int a = string2.codePointAt(1);
        int b = string2.codePointAt(9);

        System.out.println(a);
        System.out.println(b);

        int c = string2.codePointBefore(1);
        int d = string2.codePointBefore(9);
        System.out.println(c);
        System.out.println(d);

        int ctr = string2.codePointCount(1, 10);

        // prints character from index 1 to index 10
        System.out.println("Codepoint count = " + ctr);

    }
}
