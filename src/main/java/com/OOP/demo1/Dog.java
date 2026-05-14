package com.OOP.demo1;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name) {
        super(name);
    }

    public void lookHome() {
        System.out.println(getName() + " 看家");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " 吃狗粮");
    }
}
