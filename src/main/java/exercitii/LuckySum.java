package exercitii;

public class LuckySum {

    static int luckySum(int a, int b, int c) {
        int sum = 0;
        int[] values = new int[3];
        values[0] = a;
        values[1] = b;
        values[2] = c;

        for (int i = 0; i <= values.length-1; i++) {
            if (values[i] == 13) {
                break;
            } else {
                sum=sum+values[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 13;
        System.out.println(luckySum(a,b,c));


    }
}
