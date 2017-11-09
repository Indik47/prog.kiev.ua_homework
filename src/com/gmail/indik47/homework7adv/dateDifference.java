package com.gmail.indik47.homework7adv;

/*      Ввести с консоли дату. Сравнить ее с текущей датой в системе. Вывести
        отличающиеся части (год, месяц) на экран.
        */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateDifference {
    public static void main(String[] args) {
        Date dateInput = inputDateParse();
        Date dateCurrent = new Date();

        String dateInputStr = formatDate(dateInput);
        String dateCurrentStr = formatDate(dateCurrent);

        compareDates(dateInputStr, dateCurrentStr);
    }

    public static Date inputDateParse() {
        Scanner sc = new Scanner(System.in);
        Date dateInput = new Date();
        SimpleDateFormat sdfOne = new SimpleDateFormat("dd MM yyyy");

        System.out.println("Input date (e.g. 01 05 1986):");
        String input = sc.nextLine();
        try {
            dateInput = sdfOne.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateInput;
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdfOne = new SimpleDateFormat("dd MM yyyy");
        String dateStr = sdfOne.format(date);
        return dateStr;
    }

    public static void compareDates(String dateInputStr, String dateCurrentStr) {
        String[] dateInputArr = dateInputStr.split(" ");
        String[] dateCurrentArr = dateCurrentStr.split(" ");

        String[] dateNames = new String[]{"day", "month", "year"};
        for (int i = 0; i < dateInputArr.length; i++) {
            if (!dateInputArr[i].equals(dateCurrentArr[i])) {
                System.out.println("Input " + dateNames[i] + ": " + dateInputArr[i] + ", current " + dateNames[i] + ": " + dateCurrentArr[i]);
            } else {
                System.out.println("Input " + dateNames[i] + " matches current.");
            }
        }
    }
}
