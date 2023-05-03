package Stacks;

import java.util.*;
public class Stack4 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        // Create Graph to explain hierarchy of collections

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        // Create Graph to explain hierarchy of collections

        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
        // returns the position from the top of the stack where the object is located with base case being 1
        // the return value -1 indicates that the object is not on the stack.
        System.out.println(stack.search(15));
        System.out.println(stack.search(10));
        System.out.println(stack.search(5));
        System.out.println(stack.search(20));

        while (stack.size() > 0)
        {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

    }
    }

