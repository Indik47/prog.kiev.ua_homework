package com.gmail.indik47.homework4;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X and Y: ");
        int inputX = sc.nextInt();
        int inputY = sc.nextInt();

        for (int i = 1; i <= inputY; i++) {
            if (i == 1 || i == inputY) {
                for (int j = 1; j <= inputX; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= inputX - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
