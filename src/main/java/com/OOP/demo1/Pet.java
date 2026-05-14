package com.OOP.demo1;

/** 宠物抽象父类：公共属性与行为，子类实现 {@link #eat()}。 */
public abstract class Pet {
    private final String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " 睡觉");
    }

    public void play() {
        System.out.println(name + " 玩耍");
    }

    public void drink() {
        System.out.println(name + " 喝水");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age + "}";
    }
}
