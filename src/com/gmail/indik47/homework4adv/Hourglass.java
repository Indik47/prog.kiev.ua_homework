package com.gmail.indik47.homework4adv;

import java.util.Scanner;

/*      Выведите на экран «песочные часы» максимальная ширина которых
        считывается с клавиатуры (число нечетное). В примере ширина равна 5.*/
public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n % 2 == 0) {
            System.out.println("Enter width(odd number): ");
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < (n/2 - Math.abs(n/2 - i)); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k  < (Math.abs(n - (2 * i+1))+1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

