package com.gmail.indik47.homework7;

import java.util.Arrays;

public class ToStringMethod {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 7, -13, 155};
        System.out.println(toString(arr));
    }

    public static String toString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s = s + arr[i] + "]";
            } else {
                s = s + arr[i] + ", ";
            }
        }
        return s;
    }
}
