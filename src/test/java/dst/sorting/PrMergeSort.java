package dst.sorting;

import java.util.Arrays;

public class PrMergeSort {

    public static int[]mergeSort(int[]arr){



        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                   temp = arr[j] ;
                   arr[j] = arr[i];
                   arr[i] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[]args){
        int[]arr = {1,4,3,2};

        System.out.println(Arrays.toString(mergeSort(arr)));


    }
}
