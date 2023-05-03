package com.DSA.Stacks;

public class Stack1 { // This is first implementation using global variables
    static final int max=10;
    int top;
    int []arr=new int[max]; //Maximum size of array and if it exceeds it throws stack overflow error
    Stack1()    // initializing top value to -1
    {
        top=-1;
    }
    public boolean push(int x)
    {
        if(top>=max-1)
        {
            System.out.println("Stack is overflow");
            return false;
        }
        else {
            arr[++top]=x;
            System.out.println(x+ " is pushed into the stack");
            return true;


        }
    }
    public int pop() {
        if(top<0) {
            System.out.println("Stack is underflow");
            return Integer.MIN_VALUE;
        }
        else {
            int x=arr[top--];
            return x;
        }
    }
    public int peek() {
        if(top<0) {
            System.out.println("Stack is UnderFlow");
            return 0;
        }
        else {
            int x=arr[top];
            return x;
        }
    }
    int size() {
        return (top + 1);
    }
    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }



    public static void main(String args[])
    {
        Stack1 s=new Stack1();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.pop()+ " is popped out from stack");
//        System.out.println(s.pop()+ " is popped out from stack");
//        System.out.println(s.pop()+ " is popped out from stack");
//        System.out.println(s.pop()+ " is popped out from stack"); // Integer.MINVALUE is returned since Stack is underflow
        System.out.println(s.peek() + " is top element");
        String result;
        System.out.println(result = (s.isEmpty()) ? "Stack is Empty" : "Stack is not Empty");
        System.out.println(result = (s.isFull()) ? "Stack is Full" : "Stack is not Full");


    }
}
