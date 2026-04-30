package com.OOP;

public class Student {

    private String name;


    public Student() {
        // Default constructor
    }


    public void Introduce() {
        System.out.println("Hello, my name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
