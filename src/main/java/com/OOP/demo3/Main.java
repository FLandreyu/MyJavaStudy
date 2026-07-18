package com.OOP.demo3;

public class Main {
    public static void main(String[] args) {
        System.out.println(test(new Point(1, 2)));
    }

    public static String test(Object obj){
        return switch (obj){
            case Integer _ -> "Integer";
            case String _ -> "String";
            case Float _ -> "Float";
            case Point(int _,int _) -> "Point";
            default -> "default";
        };
    }
}

