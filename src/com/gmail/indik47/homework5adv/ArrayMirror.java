package com.gmail.indik47.homework5adv;

/*      Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
        массив может быть произвольной длинны. (При выполнении задания
        использовать дополнительный массив нельзя)*/

public class ArrayMirror {
    public static void main(String[] args) {
        int[] arr = arrayInit(4);
        arrayPrint(arr);
        arrayMirror(arr);
        System.out.println("\n----------");
        arrayPrint(arr);
    }

    public static int[] arrayInit(int m) {      //инициализация массива
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public static int[] arrayMirror(int[] arr) {  //зеркальный переворот массива
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static int[] arrayPrint(int[] arr) {    //печать массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
