package arrayoperations;

public class ArrayAverage {

    public static void main(String[] args) {

        // se da un array cu un numar de elemente
        // sa se afiseze media numerelor din array
        int[] numere = {1, 4, 6, 7, 2, 9, 4,10};
        int sum = 0;
        double medie = 0;

        for (int i = 0; i <= numere.length - 1; i++) {
            System.out.print(numere[i]+" ");

            sum = sum + numere[i];

        }
        System.out.println();
        System.out.println("Suma numerelor este: " + sum);
        medie=(double)sum/numere.length;
        System.out.println("Media aritmetica a numerelor este: "+ medie);

    }
}
