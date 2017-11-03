package com.gmail.indik47.homework5adv;

import java.util.Arrays;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        String[] singleDigits = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] elevenNineteen = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "eighteen", "nineteen"};
        String[] tenth = new String[]{"ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundredsMillions = new String[]{"", "thousand", "million", "billion"};
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money?");
        String input = "25815312,4";  //sc.nextLine();
        String[] money = input.split("[,]");

        char[] moneyInt = money[0].toCharArray();
        char[] moneyCents = money[1].toCharArray();

        for (int i = 0; i < moneyInt.length; i++) {
            int index = moneyInt.length - i;
            int value = Character.getNumericValue(moneyInt[i]);


            //первая цифра в тройке - индексы массива 3,6,9,12..
            if (index % 3 == 0) {
                System.out.print(singleDigits[value - 1] + " hundred ");
            }

            //вторая цифра в тройке, если она МЕНЬШЕ двух десятков(одинадцать, пятнадцать т.п.) -  2,5,8,11..
            if ((index - 2) % 3 == 0 && value < 2) {
                System.out.print(elevenNineteen[Character.getNumericValue(moneyInt[i + 1])] + " ");
                System.out.println(hundredsMillions[(index - 1) / 3]);
            }

            //вторая цифра в тройке, если она БОЛЬШЕ двух десятков
            else {
                if (/*индекс 2,5,8..*/(index - 2) % 3 == 0 && value >= 2) {
                    System.out.print(tenth[value - 1] + " ");
                }
            }

            //третья(последняя) цифра в тройке  -  индексы массива 1,4,7,10..*/
            if ((index - 1) % 3 == 0 && Character.getNumericValue(moneyInt[i - 1]) >= 2) {
                System.out.print(singleDigits[value - 1] + " ");
                System.out.println(hundredsMillions[(index - 1) / 3]);
            }
        }

    }
}
