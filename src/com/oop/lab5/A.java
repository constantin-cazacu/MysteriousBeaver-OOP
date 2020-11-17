package com.oop.lab5;

public class A {
    protected String name;
    protected static X x = new X("I am X from A");

    protected A(String name, X x) {
        this.name = name;
        System.out.println("I am from class A");
        System.out.println(A.x.getName());
    }
}


