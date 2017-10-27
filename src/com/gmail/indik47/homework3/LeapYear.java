package com.gmail.indik47.homework3;

import java.util.Scanner;

/*      3) Определить количество дней в году, который вводит пользователь. В
        високосном годе - 366 дней, тогда как в обычном 365. Високосный год
        определяется по следующему правилу:
        Год високосный, если он делится на четыре без остатка, но если он
        делится на 100 без остатка, это не високосный год. Однако, если он
        делится без остатка на 400, это високосный год.                 */

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearInput;

        System.out.println("Enter a year: ");
        yearInput = sc.nextInt();

        if (((yearInput % 4) == 0) && (yearInput % 100 != 0) || ((yearInput % 400) == 0)) {
            System.out.println("Leap year!");
        } else {
            System.out.println("Regular year.");
        }
    }
}
