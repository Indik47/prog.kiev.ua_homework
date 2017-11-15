package com.gmail.indik47.homework8adv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishTextFromFile {
    public static void main(String[] args) {
        File file = new File("english.txt");
        String s = readTextFromFile(file);
        HashMap<Character, Integer> hm = countLettersInString(s.toLowerCase().toCharArray());
        printCountedLetters(hm);
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

    public static HashMap<Character, Integer> countLettersInString(char[] s) {
        int counter;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            counter = 0;
            for (char ch2 : s) {
                if (ch2 == ch) {
                    counter++;
                }
            }
            hm.put(ch, counter);
        }
        return hm;
    }

    public static void printCountedLetters(HashMap<Character, Integer> hm) {
        int maxValue = 0;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            Integer value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
            }
        }
        for (int i = maxValue; i > 0; i--) {
            for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
                Integer value = entry.getValue();
                Character key = entry.getKey();
                if (value == i) {
                    System.out.println(key + ": " + value);
                }
            }
        }
    }
}
