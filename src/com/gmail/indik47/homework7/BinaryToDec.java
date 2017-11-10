package com.gmail.indik47.homework7;

/*
Ввести с консоли число в бинарном формате. Перевести его в
        десятичный и вывести на экран (“10” -> 2).
*/

import java.util.Scanner;

public class BinaryToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int inputNum = sc.nextInt();

        System.out.println(binToDec(inputNum));
    }

    public static int binToDec(int input) {
        int dec = 0;
        int n = 0;
        while (input != 0) {
            dec = dec + ((input % 10) * (int)Math.pow(2, n));
            input = input/10;
            n++;
        }
        return dec;
    }
}
