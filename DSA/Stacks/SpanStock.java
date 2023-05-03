package com.DSA.Stacks;

public class SpanStock {
    public static void stockSpan(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int curr_span = 1;
            for (int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--) {
                curr_span++;
                System.out.print(curr_span + " ");

            }
        }}
        public static void main (String args[]){
            int[] arr = new int[]{12, 14, 15, 7, 15, 17, 5};
            int size = arr.length;
            stockSpan(arr, size);
        }
    }

    //Time Complexity is O(n2).
