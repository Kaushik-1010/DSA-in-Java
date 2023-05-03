package com.DSA.Stacks;
import java.util.*;
public class Stack3 {
    public static void main(String args []) {
        ArrayDeque<Integer> stack= new ArrayDeque<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
//        for (Integer integer : stack) {
//            System.out.print(integer + " ");
//           }
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.isEmpty());
    }
}
