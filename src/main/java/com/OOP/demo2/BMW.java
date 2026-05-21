package com.OOP.demo2;

/** 宝马：实现 {@link Icar} 的基础车型。 */
public class BMW implements Icar {
    private final String name;
    private final int price;

    public BMW(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', price=" + price + "}";
    }
}
