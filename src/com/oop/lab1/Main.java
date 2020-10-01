package com.oop.lab1;

import com.oop.lab1.advanced.University;
import com.oop.lab1.basic.Monitor;

public class Main {

    public static void main(String[] args) {
        //basic task
        Monitor M1 = new Monitor("charcoal black", 1080, 22);
        Monitor M2 = new Monitor("crimson red", 1440, 24);

        System.out.println("Monitor #1    \t Monitor #2");
        System.out.println(M1.getColor() + "\t " + M2.getColor());
        if(M1.getResolution() > M2.getResolution()){
            System.out.println( M1.getResolution() + " > " + M2.getResolution());
        } else if (M1.getResolution() < M2.getResolution()){
            System.out.println(M1.getResolution() + " < " + M2.getResolution());
        } else {
            System.out.println(M1.getResolution() + " = " + M2.getResolution());
        }

        if(M1.getDiagonal() > M2.getDiagonal()){
            System.out.println(M1.getDiagonal() + " > " + M2.getDiagonal());
        } else if (M1.getDiagonal() < M2.getDiagonal()){
            System.out.println(M1.getDiagonal() + " < " + M2.getDiagonal());
        } else {
            System.out.println(M1.getDiagonal() + " = " + M2.getDiagonal());
        }
        //advanced task
        /*Student student1 = new Student("Wilson", 20, 9.5);
        Student student2 = new Student("Wendy", 21, 8.0);
        Student student3 = new Student("Wolfgang", 19, 7.4);
        Student student4 = new Student("Woody", 20, 6.5);
        Student student5 = new Student("Webber", 21, 9.0);
        Student student6 = new Student("Wigfrid", 20, 8.5);

        System.out.println("Student name\t Age\tMath mark");
        System.out.println(student1.getName() + "           " + student1.getAge() + "       " + student1.getMark());
        System.out.println(student2.getName() + "            " + student2.getAge() + "       " + student2.getMark());
        System.out.println(student3.getName() + "         " + student3.getAge() + "       " + student3.getMark());
        System.out.println(student4.getName() + "            " + student4.getAge() + "       " + student4.getMark());
        System.out.println(student5.getName() + "           " + student5.getAge() + "       " + student5.getMark());
        System.out.println(student6.getName() + "          " + student6.getAge() + "       " + student6.getMark()); */

        University Uni1 = new University("CalArts",1961);
        Uni1.addStudent(new University.Student("Wilson", 20, 9.5));
        Uni1.addStudent(new University.Student("Wendy", 21, 8.0));
        Uni1.addStudent(new University.Student("Wolfgang", 19, 7.4));
        Uni1.addStudent(new University.Student("Woody", 20, 6.5));
        System.out.println(Uni1.getName() + ", founded in " + Uni1.getFoundationYear() + " has the following students:");
        Uni1.printStudents();
        Uni1.averageMark();

        System.out.println(" ");
        University Uni2 = new University("RISD",1877);
        Uni2.addStudent(new University.Student("Webber", 21, 9.0));
        Uni2.addStudent(new University.Student("Wigfrid", 20, 8.5));
        Uni2.addStudent(new University.Student("Willow", 19, 6.5));
        Uni2.addStudent(new University.Student("Wes", 19, 7.0));
        System.out.println(Uni2.getName() + ", founded in " + Uni2.getFoundationYear() + " has the following students:");
        Uni2.printStudents();
        Uni2.averageMark();

        System.out.println(" ");
        University Uni3 = new University("MIT",1861);
        Uni3.addStudent(new University.Student("Maxwell", 21, 10.0));
        Uni3.addStudent(new University.Student("Warly", 22, 7.7));
        Uni3.addStudent(new University.Student("Walter", 19, 8.5));
        Uni3.addStudent(new University.Student("Wilbur", 20, 9.0));
        System.out.println(Uni3.getName() + ", founded in " + Uni3.getFoundationYear() + " has the following students:");
        Uni3.printStudents();
        Uni3.averageMark();

    }


}
