package com.gmail.indik47.homework3;

public class TriangleExistance {
    /*Треугольник существует только тогда, когда сумма любых двух его
    сторон больше третьей. Дано: a, b, c – стороны предполагаемого
    треугольника. Напишите программу которая укажет существует такой
    треугольник или нет.*/
    public static void main(String[] args) {
        double a = 2;
        double b = 1;
        double c = 5;

        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Triangle doesn`t exist.");
        } else {
            System.out.println("Triangle exists.");
        }
    }
}
