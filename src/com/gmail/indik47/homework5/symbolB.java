package com.gmail.indik47.homework5;

import java.util.Scanner;

/*      4) Введите строку текста с клавиатуры — реализуйте программу для
        возможности подсчета количества символа — 'b' в этой строке, с выводом
        результат на экран.*/
public class symbolB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a text string: ");
        String text = sc.nextLine();

        char[] arr = text.toCharArray();

        int count = 0;
        for (char ch : arr) {
            if (ch == 'b') {
                count++;
            }
        }
        System.out.println("Number of b symbols is: " + count);
    }
}
