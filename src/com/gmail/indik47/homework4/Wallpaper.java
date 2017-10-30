package com.gmail.indik47.homework4;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of lines: ");
        int inputNum = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < inputNum; j++) {
                if (j % 2 == 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println("");
        }
    }
}
