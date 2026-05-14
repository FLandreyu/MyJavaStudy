package com.OOP.demo1;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name) {
        super(name);
    }

    public void catchMouse() {
        System.out.println(getName() + " 抓老鼠");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " 吃猫粮");
    }
}
