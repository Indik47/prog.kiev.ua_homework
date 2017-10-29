package com.gmail.indik47.homework3adv;

public class LuckyTicket {
    public static void main(String[] args) {
        int number = 7088;
        int a;
        int b;
        int c;
        int d;
        int sumAB = 0;
        int sumCD = 0;

        a = number / 1000;
        b = (number % 1000) / 100;
        c = (number % 100) / 10;
        d = number % 10;
        if (a + b > 10) {
            sumAB = (a + b) / 10 + (a + b) % 10;
        }
        if (c + d > 10) {
            sumCD = (c + d) / 10 + (c + d) % 10;
        }

       if (sumAB != 0 && sumAB == c + d) {
            System.out.println("Double lucky!");
        } else if (sumCD != 0 && sumCD == a + b) {
            System.out.println("Double lucky!");
        } else if ((a + b) == (c + d)) {
            System.out.println("Lucky ticket!");
        } else {
            System.out.println("Not lucky this time.");
        }
    }
}

