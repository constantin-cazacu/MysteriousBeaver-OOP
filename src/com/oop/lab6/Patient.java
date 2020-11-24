package com.oop.lab6;


import java.util.ArrayList;

public class Patient extends Person {
    private String id;
    private FullName name;
    private Gender gender;
    private Date birthDate;
    private int age;
    private Date accepted;
    private History sickness;
    private ArrayList<String> prescription;
    private ArrayList<String> allergies;
    private ArrayList<String> specialReqs;
    private ArrayList<OperationsStaff> OperationStaff;

    public class History{}

}
