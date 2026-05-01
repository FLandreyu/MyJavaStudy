package com.String;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH
        System.out.println(sb.length()); // Output: 11
    }
}
