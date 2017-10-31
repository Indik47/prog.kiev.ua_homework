package com.gmail.indik47.homework4adv;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        boolean toggle = true;
        System.out.println("Enter height: ");
        int height = sc.nextInt();

        for (;i > 0;) {
            String s = "*******************";
            System.out.println(s.substring(i, i * 2));
            if (i == height) {   //если счетчик дошел до макс.высоты, переключаем toggle в false и счетчик начинает идти в минус
                toggle = false;
            }
            if (toggle) {
                i++;
            } else {
                i--;
            }
        }
    }
}

