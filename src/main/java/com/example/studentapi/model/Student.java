package com.example.studentapi.model;

public class Student {
    private String name;
    private String rollNumber;

    // Constructor
    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
