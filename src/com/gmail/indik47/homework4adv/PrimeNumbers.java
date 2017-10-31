package com.gmail.indik47.homework4adv;
/*      С помощью циклов вывести на экран все простые числа от 1 до 100.
        Простое число — число которое делиться нацело только на единицу или
        само на себя. Первые простые числа это — 2,3,5,7…*/

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            boolean primeNum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {       //пробегаем циклом по всем числам от 2 до текущего
                    primeNum = false;
                    break;
                }
            }
            if (primeNum) {
                System.out.print(i + " ");
            }
        }
    }
}
