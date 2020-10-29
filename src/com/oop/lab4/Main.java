package com.oop.lab4;

public class Main {
    public static void main(String[] args) {
        //first file
        String[] expressions = ReadFile.readFromFile("src/com/oop/lab4/one_expression.txt");
        //second file
        //String[] expressions = ReadFile.readFromFile("src/com/oop/lab4/three_expressions.txt");

        for(String expression : expressions){
            System.out.println(expression + " : " + ExpressionValidator.balancedParenthesis(expression));
        }
    }
}
