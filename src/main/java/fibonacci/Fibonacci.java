package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        int first =0;
        int second = 1;
        int next;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=0;i<10;i++){
            next = first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }
}
