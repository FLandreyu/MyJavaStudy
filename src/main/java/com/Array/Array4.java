package com.Array;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 6, 2 };

        // toString方法可以将数组转换为字符串形式，方便打印输出
        System.out.println("原数组: " + Arrays.toString(arr));

        // sort方法可以对数组进行排序，默认是升序排序
        Arrays.sort(arr);
        System.out.println("排序后的数组: " + Arrays.toString(arr));
    }
}
