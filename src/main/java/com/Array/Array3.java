package com.Array;

public class Array3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        assignValues(arr); // 给数组赋值
        System.out.println("二维数组的内容:");
        printArray(arr); // 打印数组内容
    }

    // 数组赋值
    public static void assignValues(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j; // 示例赋值，可以根据需要修改
            }
        }
    }

    // 数组打印
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 换行
        }
    }
}
