package com.gmail.indik47.homework5;

import java.util.Arrays;

/*      3)Создать массив случайных чисел (размером 15 элементов). Создайте
        второй массив в два раза больше, первые 15 элементов должны быть
        равны элементам первого массива, а остальные элементы заполнить
        удвоенных значением начальных. Например
        Было → {1,4,7,2}
        Стало → {1,4,7,2,2,8,14,4}*/
public class arrayDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9);
        }
        System.out.println(Arrays.toString(arr));
        int[] arrDupl = Arrays.copyOf(arr, arr.length * 2);

        for (int i = 0; i < arrDupl.length / 2; i++) {
            arrDupl[arrDupl.length/2 + i] = arrDupl[i] * 2;
        }
        System.out.println(Arrays.toString(arrDupl));
    }
}
