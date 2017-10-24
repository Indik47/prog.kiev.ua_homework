package com.gmail.indik47.homework2;

public class TriangleArea {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = 5;

        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Area of a given trianle: " + square);
        } else {
            System.out.println("Triangle doesn`t exist.");
        }
    }
}
