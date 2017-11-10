package com.gmail.indik47.homework7adv;
/*      H = 0+1+1+0+0+1+0+0 = 3 - расстояние Хэмминга между (117,17)
        Даны два положительных целых числа (N, M) в десятичном виде. Вам
        необходимо подсчитать расстояние Хэмминга между этими двумя
        числами.*/

public class Hamming {
    public static void main(String[] args) {
        int n = 117;
        int m = 4;

        System.out.println("Hamming distance is " + hammingDistCalc(n, m));
    }

    public static int hammingDistCalc(int n, int m) {
        int count = 0;
        //n = n>>1;
        for (int i = 0; i < 32; i++) {
            if ((n % 2 == 0 && m % 2 != 0) || (m % 2 == 0 && n % 2 != 0)) {
                count++;
            }
            n = n >> 1;
            m = m >> 1;
        }
        return count;
    }
}
