package com.gmail.indik47.homework6;


public class ArrayCombinationsFact  {
    public static void main(String args[]) {
        String[] s = {"1", "2", "3", "4"};
        permutate(s);
    }

    public static void permutate(String[] arr){
        permuteIteration(arr, 0);
    }

    private static void permuteIteration(String[] arr, int index){
        //последняя итерация
        if(index >= arr.length - 1){
            for(String s: arr) System.out.print(s + " ");
            System.out.println("");
            return;
        }

        for(int i = index; i < arr.length; i++){
            String temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permuteIteration(arr, index+1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}