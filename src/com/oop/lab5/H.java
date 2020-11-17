package com.oop.lab5;

public class H extends G {
   // protected static X x = new X("I am X from H");
    private static X x = new X("I am X from H");

    protected H(String name, X x) {
        super(name, x);
        System.out.println("I am from class H");
        System.out.println(H.x.getName());
    }

}

