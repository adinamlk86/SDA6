package stringoperations;

import java.sql.SQLOutput;

public class CharArrayToString {

    public static void main(String[] args) {
        char[] array = {'2','4','5','7'};

        String str = String.copyValueOf(array);

        System.out.println(str);
    }
}
