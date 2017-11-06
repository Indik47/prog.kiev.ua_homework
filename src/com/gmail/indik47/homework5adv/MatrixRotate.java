package com.gmail.indik47.homework5adv;
/*      «Перевернуть массив». Т.е. написать программу которая повернет
        базовый массив на 90,180,270 градусов по часовой стрелке. (При
        выполнении задания использовать дополнительный массив нельзя). В
        примере показан поворот на 90 градусов - (3 часа)*/

import java.util.Scanner;

public class MatrixRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = arrayInit(6);
        arrayPrint(arr);
        while (true) {
            System.out.println("Enter 90, 180 or 270 degrees: ");
            int rotate = sc.nextInt();
            if (rotate == 90 || rotate == 180 || rotate == 270) {
                for (int i = 0; i < rotate / 90; i++) {
                    arrayRotateClock(arr);
                }
                break;
            } else {
                System.out.println("Wrong input.");
            }
        }
        arrayPrint(arr);
    }

    public static int[][] arrayInit(int m) {      //инициализация массива
        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            arr[i] = new int[]{1, 2, 3, 4, 5, 6};
        }
        return arr;
    }

    public static int[][] arrayRotateClock(int[][] arr) {  //переворот массива на 90 по часовой стрелке
        int m = arr.length;
        for (int i = 0; i < m / 2; i++) {
            for (int j = i; j < m - 1 - i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[m - 1 - j][i];
                arr[m - 1 - j][i] = arr[m - 1 - i][m - 1 - j];
                arr[m - 1 - i][m - 1 - j] = arr[j][m - 1 - i];
                arr[j][m - 1 - i] = temp;
            }
        }
        return arr;
    }

    public static int[][] arrayRotateCountClock(int[][] arr) {  //переворот массива на 90 против часовой стрелки
        int m = arr.length;
        for (int i = 0; i < m / 2; i++) {
            for (int j = i; j < m - 1 - i; j++) {
                int temp = arr[j][j];
                arr[i][j] = arr[j][m - 1 - i];
                arr[j][m - 1 - i] = arr[m - 1 - i][m - 1 - j];
                arr[m - 1 - i][m - 1 - j] = arr[m - 1 - j][i];
                arr[m - 1 - j][i] = temp;
            }
        }
        return arr;
    }

    public static int[][] arrayPrint(int[][] arr) {    //печать массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return arr;
    }
}
