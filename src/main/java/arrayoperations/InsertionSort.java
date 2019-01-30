package arrayoperations;

public class InsertionSort {


    public void sort(int[] list){

        for(int i=1; i<list.length;i++){
            int j =i-1;
            int key = list[i];
            while( j>=0 && list[j]>=key ){
                list[j+1]=list[j];
                j--;

            }
            list[j+1]=key;

        }

    }
}


