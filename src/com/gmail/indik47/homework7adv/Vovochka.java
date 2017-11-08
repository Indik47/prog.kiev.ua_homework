package com.gmail.indik47.homework7adv;

public class Vovochka {
    public static void main(String[] args) {
        String[] inputArr = new String[]{"125556125556125556", "125556612555661255566125556612555661255566"};

        int[] numbers = inputStringsToNumbers(inputArr);

        System.out.println(minNum(numbers));
    }

    public static int[] inputStringsToNumbers(String[] inputArr) {
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = repeatingNumber(inputArr[i]);
        }
        return arr;
    }

    public static int repeatingNumber(String n) {
        int count = n.length();
        for (int i = 1; i <= n.length() / 2; i++) {
            if ((n.substring(0, i).equals(n.substring(i, i * 2))) && (i < count)) {
                count = i;
            }
        }
        return Integer.parseInt(n.substring(0, count));
    }

    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
