package com.String;

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        int smallcount = 0;
        int bigcount = 0;
        int numcount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                smallcount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigcount++;
            } else if (ch >= '0' && ch <= '9') {
                numcount++;
            }
        }
        System.out.println("\nNumber of small letters: " + smallcount);
        System.out.println("Number of big letters: " + bigcount);
        System.out.println("Number of digits: " + numcount);
        sc.close();
    }
}
