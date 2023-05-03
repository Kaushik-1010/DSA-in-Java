package Stacks;

import java.util.Stack;

public class PreviousGreaterElementOptimizedApproach {

    public static void main(String args[]) {
        int[] arr = {30, 50, 20, 15, 25};
        int size = arr.length;
        previousGreater(arr, size);
    }
        private static void previousGreater ( int[] arr, int size){
            Stack<Integer> s = new Stack<>();
            s.add(arr[0]);

            System.out.print("- ");
            for (int i = 1; i < size; i++) {
                while (s.isEmpty() == false && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.empty())
                    System.out.print("- ");
                else
                    System.out.print(s.peek() + " ");

                s.push(arr[i]);
            }
        }
    }
