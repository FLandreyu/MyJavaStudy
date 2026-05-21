package com.OOP.demo2;

public class CarTest {
    public static void main(String[] args) {
        BMW bmw = new BMW("宝马X5", 500_000);
        System.out.println(bmw.getName() + " 售价: " + bmw.getPrice());
        System.out.println(bmw);

        DiscountCar discountCar = new DiscountCar("宝马3系", 300_000, 0.85);
        System.out.println(discountCar.getName() + " 售价: " + discountCar.getPrice());
        System.out.println(discountCar);

        System.out.println("--- 多态：接口引用指向不同实现 ---");
        Icar[] cars = {
            new BMW("宝马7系", 800_000),
            new DiscountCar("宝马1系", 200_000, 0.9)
        };
        for (Icar car : cars) {
            System.out.println(car.getName() + " -> " + car.getPrice() + " 元");
        }

        System.out.println("--- instanceof：子类特有信息 ---");
        Icar some = new DiscountCar("宝马5系", 450_000, 0.88);
        if (some instanceof DiscountCar dc) {
            System.out.println(dc.getName() + " 享 " + (int) (dc.getDiscountRate() * 100) + "% 折扣");
        }
    }
}
