package com.oop.lab6;

import java.util.ArrayList;

abstract class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName name;
    private Date birthDate;
    private Gender gender;
    private Address homeAddress;
    private Phone phone;
    private ArrayList<Hospital> hospitals;

    public class Address{}
    public class Phone{}
    enum Gender {
        Male,
        Female,
        Other
    }
    public class Date{}
    public class FullName{}
}
