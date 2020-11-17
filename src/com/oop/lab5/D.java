package com.oop.lab5;

public class D extends C{
    protected static X x = new X("I am X from D");

    protected D(String name, X x) {
        super(name, x);
        System.out.println("I am from class D");
        System.out.println(D.x.getName());
    }
}

