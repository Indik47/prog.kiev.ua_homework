package com.gmail.indik47.homework4adv;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        boolean toggle = true;
        String s = "";
        System.out.println("Enter height: ");
        int height = sc.nextInt();

        for (; i > 0; ) {
            if (toggle) {
                i++;
                s = s + "*";
                System.out.println(s);
            } else {
                i--;
                System.out.println(s.substring(0, i));
            }
            if (i == height) {   //если счетчик дошел до макс.высоты, переключаем toggle в false и счетчик начинает идти в минус
                toggle = false;
                s = s + "*";    //при переключении toggle печатаем центральную, самую длинную строку
                System.out.println(s);
            }
        }
    }
}

