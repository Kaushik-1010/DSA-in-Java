package Stacks;

import java.util.*;
public class minStack {
    private final Stack stack;
    private final Stack minStack;
    public minStack() {
        stack = new Stack();
        minStack = new Stack();
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min((Integer) minStack.peek(), x));
    }
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    public int top() {
        return (int) stack.peek();
    }
    public int getMin() {
        return (int) minStack.peek();
    }
    public static void main(String[] args) {
        minStack obj = new minStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }

}
