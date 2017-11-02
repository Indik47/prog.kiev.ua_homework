package com.gmail.indik47.homework4adv;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j = 1;

        System.out.println("Enter height: ");
        int n = 4;//sc.nextInt();


        for (; i <= (2 * n - 1); ) {
            if (j > n - Math.abs(n - i)) {
                System.out.println("");
                i++;
                j = 1;
            } else {
                System.out.print("*");
                j++;
            }
        }
    }
}


