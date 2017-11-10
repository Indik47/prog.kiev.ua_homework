package com.gmail.indik47.homework7adv;

/*      Ввести с консоли дату. Сравнить ее с текущей датой в системе. Вывести
        отличающиеся части (год, месяц) на экран.
        */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Date dateInput = parseInputDate();
        Date dateCurrent = new Date();

        String dateInputToString = formatDate(dateInput);
        String dateCurrentToString = formatDate(dateCurrent);

        compareDates(dateInputToString, dateCurrentToString);
    }

    public static Date parseInputDate() {
        Scanner sc = new Scanner(System.in);
        Date dateInput = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

        System.out.println("Input date dd MM yyyy (e.g. 01 05 1986):");
        dateInput = null;
        while (dateInput == null) {
            String input = sc.nextLine();
            try {
                dateInput = sdf.parse(input);
            } catch (ParseException e) {
                System.out.println("Wrong input, re-enter date: ");
            }
        }
        return dateInput;
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        String dateStr = sdf.format(date);
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
