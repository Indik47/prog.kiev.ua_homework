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
        int floor;
        int entrance;

        System.out.println("Enter flat number: ");
        flatNumber = sc.nextInt();

        while ((flatNumber < 1) || (flatNumber > 144)) {       //проверка на попадание в диапазон квартир в доме
            System.out.println("This flat number doesn`t exist in this house. Pls re-renter flat number: ");
            flatNumber = sc.nextInt();
        }

        entrance = ((flatNumber - 1) / 36) + 1;            //рассчет подъезда
        floor = ((flatNumber - 1) % 36 / 4) + 1;       // рассчет этажа

        System.out.println("Entrance " + entrance);
        System.out.println("Floor " + floor);
    }
}
