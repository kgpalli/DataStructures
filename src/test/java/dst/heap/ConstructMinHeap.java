package dst.heap;

import java.util.PriorityQueue;

public class ConstructMinHeap {
    public static PriorityQueue<Integer> minHeap(int[]arr){
        PriorityQueue<Integer>heap = new PriorityQueue<>();

        for (int j : arr) {
            heap.add(j);
        }

        return heap;
    }



    public static void main(String[]args){
        int[]array = {48,12,24,7,8,-5,24,391,24,56,2,6,8,41};

        System.out.println(minHeap(array));
    }

}
