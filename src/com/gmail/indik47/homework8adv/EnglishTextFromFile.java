package com.gmail.indik47.homework8adv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EnglishTextFromFile {
    public static void main(String[] args) {
        File file = new File("english.txt");
        String s = readTextFromFile(file);
        System.out.println(s);
        countLetters(s);
    }

    public static String readTextFromFile(File file) {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void countLetters(String s) {
        int[] counts = new int[s.length()];
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char ch = s.charAt(i);
            if (!sb.toString().contains(ch+"")){
                sb.append(ch);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            counts[i] = count;
        }}
        for (int i : counts) {
            System.out.print(i + " ");
        }


    }

}
