package com.gmail.indik47.homework3adv;

public class Palindrome {
    public static void main(String[] args) {
        int number = 611116;
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        a = number / 100000;
        b = (number % 100000) / 10000;
        c = (number % 10000) / 1000;
        d = (number % 1000) / 100;
        e = (number % 100) / 10;
        f = number % 10;
        if ((a==f)&&(b==e)&&(c==d))
        {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
