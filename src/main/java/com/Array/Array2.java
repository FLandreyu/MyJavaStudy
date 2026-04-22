package com.Array;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("数组中的数字是:");
        printArray(arr);
        System.out.println();
        System.out.println("反转后的数组是:");
        printArray(reverseArray(arr));
    }

    // 反转数组的方法
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // 打印数组元素的方法
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
