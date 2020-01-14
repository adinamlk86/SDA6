package stringoperations;

public class VariousStringExercises {
    public static boolean doesItEndIn(String string, String end){
        if(string.endsWith(end)){
            return true;
        }
        return false;
    }

    public static boolean areTheyTheSame(String string, String string2){
        if(string.equals(string2)){
            return true;
        }
        return false;
    }

    public static boolean areTheyTheSameIgnoreCase(String str, String str2){
        if(str.equalsIgnoreCase(str2)){
            return true;
        }
        return false;
    }

    public static char[] stringToCharArray(String string){

        char[] array = string.toCharArray();
        return array;
    }

    public static void main(String[] args) {
      /*  String str = "String exercises";
        String str1 = "String exercises";
        String str2 = "String exercise";
        String end = "es";

        System.out.println(doesItEndIn(str,end));
        System.out.println(doesItEndIn(str2,end));
        System.out.println();
        System.out.println(areTheyTheSame(str,str1));
        System.out.println(areTheyTheSame(str,str2));
        System.out.println();

        String one = "Stephen King";
        String two = "stephen king";
        String three = "max someone";

        System.out.println(areTheyTheSameIgnoreCase(one, two));
        System.out.println(areTheyTheSameIgnoreCase(one, three));
*/
        String test = "Java Exercises.";
        System.out.println(stringToCharArray(test));

        System.out.println("The hash code for: \""+test+"\" is:"+test.hashCode());

        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";

        String s1 = str1.substring(0,7);
        String s2 = str2.substring(28,35);

        String s3 = str1.substring(9,15);
        String s4 = str2.substring(9,15);

        System.out.println (" str1[0 - 7] == str2[28 - 35]? " + s1.equals(s2));
        System.out.println (" str1[9 - 15] == str2[9 - 15]? " + s3.equals(s4));



    }
}
