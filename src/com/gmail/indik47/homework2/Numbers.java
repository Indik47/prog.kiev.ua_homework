package com.gmail.indik47.homework2;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNum;
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;

        System.out.println("Please enter a 5 digit number: ");
        givenNum = scan.nextInt();

        n1 = givenNum / 10000;
        n2 = (givenNum % 10000)/ 1000;
        n3 = (givenNum % 1000) / 100;
        n4 = (givenNum % 100) / 10;
        n5 = (givenNum % 10);

        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5);
    }
}
