package com.oop.lab1.advanced;
import java.util.ArrayList;

public class University {
    private String name = "N/A";
    private int foundationYear = 0;
    ArrayList<Student> studentList;

    public University(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.studentList = new ArrayList<Student>();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
    public int getFoundationYear() {
        return foundationYear;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void printStudents(){
        for(Student s : studentList)
            System.out.println(s.getName() + ", " + s.getAge() + " year(s)" + ", Math mark: " + s.getMark());
    }

    public void averageMark () {
        double avgMark = 0.0;
        int n = 0;
        double sum = 0.0;
        for(Student i : studentList) {
            n+=1;
            sum+=i.getMark();
        }
        avgMark = sum / n;
        System.out.println("Average: " + avgMark);
    }

    public static class Student {
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

}
