package com.DSA.Stacks;

public class Stack2 {
    int[] arr;
    int capacity;
    int top;
    Stack2(int size) {
        top = -1;
        capacity = size;
        arr = new int [capacity];

    }

    void push(int x) {
        if (top == capacity - 1) {System.out.println("Stack OverFlow"); return;}
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {System.out.println("Stack UnderFlow"); return Integer.MIN_VALUE;}
        int res = arr[top];
        top--;
        return res;
    }

    int peek() {
        if (top == -1) {System.out.println("Stack UnderFlow"); return Integer.MIN_VALUE;}
        return arr[top];
    }

    int size() {
        return (top + 1);
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }
//} // why were you closing the class here? you have your main fucnction within the Stack2 class


    public static void main (String[] args)
    {
        Stack2 s = new Stack2(5);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty() ? "Stack is Empty" : "Stack is not Empty");
        System.out.println(s.isFull() ? "Stack is Full" : "Stack is not Full");
    }
}
