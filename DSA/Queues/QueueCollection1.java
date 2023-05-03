package Queues;

import java.util.*;
public class QueueCollection1 {
    public static void main(String args[]) {
        //LinkedList<Integer> queue = new LinkedList<>();

        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue.contains(20));
        System.out.println(queue.contains(40));
        System.out.println(queue.peek());

//        for (Integer integer : queue) {
//            System.out.print(integer + " ");
//        }

        System.out.println();

//        while (!queue.isEmpty()){
//            System.out.print(queue.peek() + " ");
//            queue.poll();
//        }

        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }

    }
    }

