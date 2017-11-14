package com.gmail.indik47.homework8;
/*
        Напишите метод для сохранения в текстовый файл
        двухмерного массива целых чисел.

        */
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwoDimensionalArrayToFile {
    public static void main(String[] args) {
        int dimension = 10;
        int[][] arr = arrayInit(dimension);
        String s = arrayToString(arr, dimension);
        writeToFile(s);

    }

    public static int[][] arrayInit(int dimension) {
        int[][] arrInt = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                arrInt[i][j] = (int) (Math.random() * 10);
            }
        }
        return arrInt;
    }

    public static String arrayToString(int[][] arr,int dimension){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void writeToFile(String s) {
        try (PrintWriter pw = new PrintWriter("testArr.txt")) {
            pw.print(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
