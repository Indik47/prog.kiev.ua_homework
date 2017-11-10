package com.gmail.indik47.homework7adv;

public class Vovochka {
    public static void main(String[] args) {
        String[] inputArr = new String[]{"11111", "1212121212","121121121"};

        int[] numbers = inputStringArrToIntArray(inputArr);

        System.out.println(minNum(numbers));
    }

    public static int[] inputStringArrToIntArray(String[] inputArr) {
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = findRepeatingNumber(inputArr[i]);
        }
        return arr;
    }

    public static int findRepeatingNumber(String n) {
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
