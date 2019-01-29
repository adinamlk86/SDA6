package arrayoperations;

import org.junit.Test;

import java.util.Arrays;

public class TestInsertionSort {

    @Test
    public void testIfInsertionSortWorks(){

        int[] lista= {6,4,3,2,1,5,9};
        InsertionSort is = new InsertionSort();

        is.sort(lista);

        System.out.println(Arrays.toString(lista));


    }
}
