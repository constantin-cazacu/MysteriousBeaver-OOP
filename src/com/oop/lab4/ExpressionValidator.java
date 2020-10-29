package com.oop.lab4;

import java.util.*;
import java.lang.String;

public class ExpressionValidator {
    public static String balancedParenthesis(String expression) {
        if (expression.isEmpty())
            return "Balanced";

        Stack<Character> stackOfParentheses = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stackOfParentheses.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stackOfParentheses.isEmpty())
                    return "Not Balanced";
                char last = stackOfParentheses.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stackOfParentheses.pop();
                else
                    return "Not Balanced";
            }
        }
        return stackOfParentheses.isEmpty()?"Balanced":"Not Balanced";
    }
}
