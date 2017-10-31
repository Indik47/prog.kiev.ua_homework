package com.gmail.indik47.homework4adv;

import java.util.Scanner;

/*      Выведите на экран «песочные часы» максимальная ширина которых
        считывается с клавиатуры (число нечетное). В примере ширина равна 5.*/
public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while ((num - 1) % 2 != 0) {
            System.out.println("Enter width(odd number): ");
            num = sc.nextInt();
        }

        for (int i = 0; i < num; i += 2) {    //верхняя половина песочных часов
            for (int j = 0; j < i / 2; j++) { //печатаем пробелы
                System.out.print(" ");
            }
            for (int k = num; k > i; k--) {   //печатаем звездочки
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = num; i > 0; i -= 2) {      //нижняя половина песочных часов
            if (i == num) continue;             //пропускаем печать первой итерации (одна звезда)
            for (int j = 0; j < i / 2; j++) {   //печатаем пробелы
                System.out.print(" ");
            }
            for (int k = num; k >= i; k--) {    //печатаем звездочки
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


