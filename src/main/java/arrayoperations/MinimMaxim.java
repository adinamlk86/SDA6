package arrayoperations;

public class MinimMaxim {
    public static void main(String[] args) {
        int[] sir = {1, 56, 94, 25, 2, 76, 23, 105, 14};
        int max = 0;
        int min = 0;

        for (int i = 0; i < sir.length; i++) {
            if(sir[i]>max){
                max=sir[i];
            }
        }
        int maxim=max;
        for(int j=0;j<sir.length;j++){

            if(sir[j]<maxim){
                min=sir[j];
                maxim=min;

            }
        }
        System.out.println("Maximul este: " + max);
        System.out.println("Minimul este: " + min);

    }
}
