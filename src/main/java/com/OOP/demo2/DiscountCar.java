package com.OOP.demo2;

/** 折扣车：继承 {@link BMW}，在原价基础上按折扣率计算售价。 */
public class DiscountCar extends BMW {
    private final double discountRate;

    public DiscountCar(String name, int price, double discountRate) {
        super(name, price);
        if (discountRate <= 0 || discountRate > 1) {
            throw new IllegalArgumentException("折扣率须在 (0, 1] 之间，当前: " + discountRate);
        }
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public int getPrice() {
        return (int) Math.round(super.getPrice() * discountRate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + getName()
                + "', 原价=" + super.getPrice()
                + ", 折扣=" + (int) (discountRate * 100) + "%"
                + ", 现价=" + getPrice() + "}";
    }
}
