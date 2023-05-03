package Queues;
//Reversing a Queue
// You have to reverse the elements of a Queue such that the first node will be the last node of the Queue and the last node will be the first node.
//
//Input : 1 2 3 4 5 6 7 8 9 10
//Output : 10 9 8 7 6 5 4 3 2
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PracticeQuestion1 {
    static Queue<Object> queue;


    static void reverse_queue()
    {
        Stack<Object> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args) {
       LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        reverse_queue();

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
}}
