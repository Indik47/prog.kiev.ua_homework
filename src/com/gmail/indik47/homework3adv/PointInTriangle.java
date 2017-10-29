package com.gmail.indik47.homework3adv;

/*      Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
        вводит с клавиатуры координаты точки x и y. Написать программу которая
        определит лежит ли эта точка внутри треугольника или нет.*/

import java.util.Scanner;

public class PointInTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = 0;
        double y1 = 0;
        double x2 = 4;
        double y2 = 4;
        double x3 = 6;
        double y3 = 1;
        double x = 4;
        double y = 2;

        double s;
        double s1;
        double s2;
        double s3;
        System.out.println("Enter x and y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();


        s = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
        s1 = Math.abs((x2 - x1) * (y - y1) - (x - x1) * (y2 - y1)) / 2;
        s2 = Math.abs((x - x1) * (y3 - y1) - (x3 - x1) * (y - y1)) / 2;
        s3 = Math.abs((x2 - x) * (y3 - y) - (x3 - x) * (y2 - y)) / 2;

        if (s == s1 + s2 + s3) {
            System.out.println("Point is inside");
        } else {
            System.out.println("Point is outside");
        }
    }
}
