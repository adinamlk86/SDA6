package arrayoperations;

public class InsertionSort {


    public void sort(int[] list){

        for(int i=0; i<list.length-1;i++){
            while(list[i]>=list[i+1]){
                int temp = list[i];
                list[i]=list[i+1];
                list[i+1]=temp;
            }

        }

    }
}


