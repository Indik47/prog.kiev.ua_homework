package com.gmail.indik47.homework8adv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoDimensionalArrayFromFile {
    public static void main(String[] args) {
        File file = new File("testArr.txt");
        int dimension = findArrayDimension(file);
        int[][] arr = readArrayFromFile(file, dimension);
        printArray(arr);
    }

    public static int findArrayDimension(File file) {
        int count = 0;
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                count++;
                sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int[][] readArrayFromFile(File file, int dimension) {
        int[][] arr = new int[dimension][dimension];
        int count = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String[] a = sc.nextLine().split(" ");
                for (int i = 0; i < a.length; i++) {
                    arr[count][i] = Integer.parseInt(a[i]);
                }
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
