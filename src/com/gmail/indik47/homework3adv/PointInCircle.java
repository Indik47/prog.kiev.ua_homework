package com.gmail.indik47.homework3adv;

import java.util.Scanner;
import static java.lang.Math.pow;


/*      Есть круг с центром в начале координат и радиусом 4. Пользователь
        вводит с клавиатуры координаты точки x и y. Написать программу которая
        определит лежит ли эта точка внутри круга или нет.*/
public class PointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double r = 4;
        double centerX = 0;
        double centerY = 0;

        System.out.println("Enter point coordinates x, y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (pow(x-centerX,2) + pow(y-centerY,2) < pow(r,2)){
            System.out.println("Point lies inside");
        } else {
            System.out.println("Point lies outside");
        }

    }
}
