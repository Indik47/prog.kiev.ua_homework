package com.gmail.indik47.homework4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        long factorial = 1;

        while ((n<4)||(n>16)){
        System.out.println("Enter a number: ");
        n = sc.nextInt();}

        for (int i = 1; i <= n; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial " + n + " = " + factorial);
    }
}
