package stringoperations;

import java.util.ArrayList;

public class PalindromCheck {

    public static boolean isItPali(String x){

        int limit=x.length();
        for(int i=0;i<limit;i++){
            if(x.charAt(i) != x.charAt(limit-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("ana");
        lista.add("lol");
        lista.add("anaaremereremeraana");
        lista.add("sigurnue");
        lista.add("niciasta");
        lista.add("loooool");

        ArrayList<String> rezultat = new ArrayList<>();

        for(String i:lista){
            if(isItPali(i)){
                rezultat.add(i);
            }
        }

        System.out.println("Elemente palindrom: "+rezultat);
//        String cuvant = "anaaremereremeraana";
//        if(isItPali(cuvant)){
//            System.out.println("Cuvantul este palindrom");
//        } else {
//            System.out.println("Cuvantul nu este palindrom");
//        }
    }

}
