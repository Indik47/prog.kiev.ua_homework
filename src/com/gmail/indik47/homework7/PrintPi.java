package com.gmail.indik47.homework7;

/*      Выведите на экран 10 строк со значением числа Пи. Причем в первой
        строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.*/

public class PrintPi {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String formatSpecifier = ("%."+(i+2)+"f%n");
            System.out.printf(formatSpecifier, Math.PI);
        }
    }
}
