package arrayoperations;

import java.util.Scanner;

public class IsItInTheArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int num=in.nextInt();

        int[] lista={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<=lista.length-1;i++){
            if(num == lista[i]){
                System.out.println("Numarul introdus se afla in lista");
                break;
            } else {
                System.out.println("Numarul introdus nu se afla in lista");
                break;
            }
        }

    }
}
