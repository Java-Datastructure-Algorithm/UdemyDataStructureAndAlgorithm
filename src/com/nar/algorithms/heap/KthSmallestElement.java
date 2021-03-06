package com.nar.algorithms.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(7, 4, 6, 3, 9, 1, 3);//1,3,3,4,6,7,9
        int k = 3; //4
        

        System.out.println("k'th smallest array element is " + findKthSmallest(A, k));
    }


    // Function to find the k'th smallest element in an
    // array using max-heap
    public static int findKthSmallest(List<Integer> list, int k) {
        // create a max-heap using the `PriorityQueue` class and
        // insert the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(list.subList(0, k));

        // do for remaining array elements
        for (int i = k; i < list.size(); i++) {
            // if the current element is less than the root of the heap
            if (list.get(i) < pq.peek()) {
                // replace root with the current element
                pq.poll();
                pq.add(list.get(i));
            }
        }

        // return the root of max-heap
        return pq.peek();
    }


}
