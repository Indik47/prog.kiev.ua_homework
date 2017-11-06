package com.gmail.indik47.homework5;

/*      1) Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
        нечетных цифр в нем.*/

public class oddNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 2, 4, 7, 1, 3, 19};
        int count = 0;

        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " odd numbers in the array");
    }
}
