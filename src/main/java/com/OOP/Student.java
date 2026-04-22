package com.OOP;

public class Student {

    String name;
    int age;

    public Student() {
        // Default constructor
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
