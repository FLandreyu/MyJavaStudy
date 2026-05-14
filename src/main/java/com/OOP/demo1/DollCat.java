package com.OOP.demo1;

/** 布偶猫：多层继承示例。 */
public class DollCat extends Cat {

    public DollCat(String name, int age) {
        super(name, age);
    }

    public DollCat(String name) {
        super(name);
    }

    public void snuggle() {
        System.out.println(getName() + " 依偎在主人身边");
    }

    @Override
    public void catchMouse() {
        System.out.println(getName() + " 慵懒地看了看老鼠，没动手");
    }
}
