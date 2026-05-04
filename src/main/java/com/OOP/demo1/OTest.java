package com.OOP.demo1;

public class OTest {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.eat();

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.lookHome();

        Cat cat1 = new Cat();
        cat1.eat();
        cat1.catchMouse();

        DollCat dollCat1 = new DollCat();
        dollCat1.eat();
        dollCat1.catchMouse();
        dollCat1.lookHome();
    }
}
