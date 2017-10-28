package com.gmail.indik47.homework3;

import java.util.Scanner;

/*      Написать программу которая считает 4 числа c клавиатуры и выведет на
        экран самое большое из них.     */
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int input;

        System.out.println("Enter 4 numbers: ");
        max = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            input = sc.nextInt();
            if (max < input) {
                max = input;
            }
        }
        System.out.println("Max number = " + max);
    }
}
