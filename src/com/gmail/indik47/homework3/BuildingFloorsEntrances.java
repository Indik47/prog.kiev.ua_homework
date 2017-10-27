package com.gmail.indik47.homework3;

import java.util.Scanner;
/*      2) Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
        начинается с единицы. На одном этаже 4 квартиры. Напишите программу
        которая получит номер квартиры с клавиатуры, и выведет на экран на
        каком этаже, какого подъезда расположенна эта квартира. Если такой
        квартиры нет в этом доме то нужно сообщить об этом пользователю.        */

public class BuildingFloorsEntrances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flatNumber;
        int floor = 1;
        int entrance = 1;

        System.out.println("Enter flat number: ");
        while (true) {                                  //проверка на попадание в диапазон квартир в доме
            flatNumber = sc.nextInt();
            if ((flatNumber < 1) || (flatNumber > 144)) {
                System.out.println("This flat number doesn`t exist in this house. Pls re-renter flat number: ");
            } else {
                break;
            }
        }

        for (int i = 0; i < 144; i += 36) {             //рассчет подъезда
            if (flatNumber > (i + 36)) {
                entrance++;
            }
        }
        for (int i = 0; i < 36; i += 4) {               //рассчет этажа
            if ((flatNumber % 36) == 0) {
                floor = 9;
                break;
            } else if ((flatNumber % 36) > (i + 4)) {
                floor++;
            }
        }
        System.out.println("Entrance " + entrance);
        System.out.println("Floor " + floor);

    }
}
