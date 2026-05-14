package com.OOP.demo1;

public class OTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("大黄", 3);
        dog1.eat();
        dog1.lookHome();
        dog1.sleep();

        Cat cat1 = new Cat("咪咪", 2);
        cat1.eat();
        cat1.catchMouse();

        DollCat dollCat1 = new DollCat("雪球", 1);
        dollCat1.eat();
        dollCat1.catchMouse();
        dollCat1.snuggle();
        System.out.println(dollCat1);

        System.out.println("--- 多态：父类引用指向子类对象 ---");
        Pet[] pets = {
            new Dog("小黑", 4),
            new Cat("花豆", 2),
            new DollCat("云朵", 1)
        };
        for (Pet p : pets) {
            p.eat();
        }

        System.out.println("---  instanceof  ---");
        Pet some = new DollCat("年糕");
        if (some instanceof DollCat dc) {
            dc.snuggle();
        }
    }
}
