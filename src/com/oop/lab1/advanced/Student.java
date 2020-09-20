package com.oop.lab1.advanced;

public class Student {
    private String name = "N/A";
    private int age = 0 ;
    private double mark = 0.0;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }
    public double getMark() {
        return mark;
    }
}
