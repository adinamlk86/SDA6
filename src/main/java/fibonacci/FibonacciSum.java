package fibonacci;

public class FibonacciSum {

    public static void main(String[] args) {
        //consideram toate numerele mai mici decat 20

        int first=0;
        int second=1;
        System.out.println("Sirul lui Fibonacci: "); //afisam sirul lui fibonacci
        System.out.print(first+" ");
        System.out.print(second+ " ");
        int sum=first+second;
        for(int i=0;i<30;i++){
            int next = first + second;
            System.out.print(next+ " ");
            if(next%2!=0){          // suma numerelor impare
                sum=sum+next;
            }
            first=second;
            second=next;
        }
        System.out.println();
        System.out.println("Suma numerelor impare este: " + sum);



    }
}
