package com.String;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("Apple").add("Banana").add("Cherry");
        System.out.println(sj.length());
        sj.toString();
        System.out.println(sj); // Output: [Apple, Banana, Cherry]
    }
}
