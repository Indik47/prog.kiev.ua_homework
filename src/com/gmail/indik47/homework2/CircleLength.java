package com.gmail.indik47.homework2;

import java.util.Scanner;

public class CircleLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double circleRadius;
        double circleLength;

        System.out.print("Please enter circle radius: ");
        circleRadius = scan.nextDouble();

        circleLength = 2 * Math.PI * circleRadius;
        System.out.println("Circle length is " + circleLength);
    }
}
