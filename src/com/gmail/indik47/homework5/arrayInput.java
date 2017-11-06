package com.gmail.indik47.homework5;

/*      2) Написать код для возможности создания массива целых чисел (размер
        вводиться с клавиатуры) и возможности заполнения каждого его элемента
        вручную. Выведите этот массив на экран.*/

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size: ");
        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " element will be: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arr));
    }
}
