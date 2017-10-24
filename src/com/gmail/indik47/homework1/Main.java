package com.gmail.indik47.homework1;

public class Main {
    public static int hexToDec(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String[] args) {
        System.out.println(hexToDec("ACDC"));
    }
}
