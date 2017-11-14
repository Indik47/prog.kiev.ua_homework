package com.gmail.indik47.homework8;
/*      Создайте консольный «текстовый редактор» с возможностью
        сохранения набранного текста в файл.*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleTextEditor {
    public static void main(String[] args) {
        String s = readFromConsole();
        writeToFile(s);
    }
    public static String readFromConsole(){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = "";
        while (!input.equals("end")){
            input = sc.nextLine();
            sb.append(input);
            sb.append(System.lineSeparator());
        }
        sb.delete(sb.length()-6,sb.length());
        return sb.toString();
    }
    public static void writeToFile(String s){
        try (PrintWriter pw = new PrintWriter("test.txt")){
            pw.print(s);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
