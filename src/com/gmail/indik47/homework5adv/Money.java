package com.gmail.indik47.homework5adv;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How much money?");
        String[] money = sc.nextLine().split("[,]");

        char[] moneyInt = money[0].toCharArray();
        inWords(moneyInt);
        System.out.print("dollars ");

        if (money.length == 2) {
            char[] moneyCents = money[1].toCharArray();
            if(Character.getNumericValue(moneyCents[0]) != 0){
            inWords(moneyCents);
            System.out.print("cent ");}
        }
    }

    public static void inWords(char[] arr) {
        String[] singleDigits = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] elevenNineteen = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tenth = new String[]{"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundredsMillions = new String[]{"", "thousand", "million", "billion"};

        boolean skip = false; //переменная для пропуска итерации

        for (int i = 0; i < arr.length; i++) {
            int index = arr.length - i; //индекс цифры в числе, растет с единиц к десяткам к сотням и т.д.
            int value = Character.getNumericValue(arr[i]); //получение int из char массива

            //если число = 0 или skip = true, переходим на следующую итерацию)
            if (value == 0 || skip) {
                skip = false;
                continue;
            }
                  /*ведем рассчет по 3 цифры: сотни-десятки-единицы. Если нужно, добавляем в нужных местах thousand, million.*/
            /*левая цифра в тройке(сотни):*/
            if (index % 3 == 0) {
                System.out.print(singleDigits[value - 1] + " hundred ");
            }

            /*средняя цифра в тройке(десятки), если она МЕНЬШЕ двух десятков(одинадцать, пятнадцать...)*/
            if (((index - 2) % 3 == 0) && (value < 2)) {                                       //если средняя цифра трехзначного числа = 1
                System.out.print(elevenNineteen[Character.getNumericValue(arr[i + 1])] + " "); //печатаем число, которое она образует с правой цифрой (=11..19)
                System.out.print(hundredsMillions[(index - 1) / 3] + " ");                     //добавляем thousand/million, если нужно
                skip = true;                                                                   //и пропускаем след.итерацию (единицы не печатаем)
            }

            /*средняя цифра в тройке(десятки), если она БОЛЬШЕ/равно двум десяткам(двадцать, тридцать...)*/
            else if ((index - 2) % 3 == 0 && value >= 2) {
                System.out.print(tenth[value - 2] + " ");
            }

            /*правая цифра в тройке(единицы)*/
            if ((index - 1) % 3 == 0) {
                System.out.print(singleDigits[value - 1] + " ");
                System.out.print(hundredsMillions[(index - 1) / 3] + " ");
            }
        }
    }
}
