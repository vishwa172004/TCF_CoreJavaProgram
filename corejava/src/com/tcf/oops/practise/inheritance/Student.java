package com.tcf.oops.practise.inheritance;

public class Student extends Person {
    protected int rollNo;
    protected String course;

    public Student(String name, int age, int rollNo, String course) {
        super(name, age); // calls Person constructor
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public void display() {
        super.display(); // prints Person details
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course : " + course);
    }
}