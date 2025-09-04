package com.tcf.oops.practise.inheritance;

public class Teacher extends Person {
    private String employeeId;
    private String subject;

    public Teacher(String name, int age, String employeeId, String subject) {
        super(name, age);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject    : " + subject);
    }
}

