package com.Exception;

public class demo1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("除数不能为0");
        } finally {
            System.out.println("无论如何都会执行");
        }
    }

    void method(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            throw new RuntimeException("除数不能为0");
        }
    }
}
