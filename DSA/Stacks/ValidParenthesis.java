package Stacks;

import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack stack = new Stack();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = (char) stack.pop();
                if (ch == ')' && topChar != '(') {
                    return false;
                }
                if (ch == ']' && topChar != '[') {
                    return false;
                }
                if (ch == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
