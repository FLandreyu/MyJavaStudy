package com.String;

public class string3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String result = arrtoString(arr);
        System.out.println(result);

    }


    public static String arrtoString(int[] arr) {
        String str = "[";
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return "[]";
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                str += arr[i] + ",";
            }
            str += arr[arr.length - 1];
        }

        return str + "]";
    }
}
