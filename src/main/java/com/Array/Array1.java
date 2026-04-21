package com.Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The numbers you entered are:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the numbers is: " + sum);

        sc.close();
    }
}
