package com.gmail.indik47.homework8;

import java.io.File;

public class CataloguesPrint {
    public static void main(String[] args) {
        File file = new File("D:\\04 models\\");
        print(file);
    }

    public static void print(File file) {
        File[] folders = file.listFiles();
        for (File f : folders) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
            }
        }
    }
}

