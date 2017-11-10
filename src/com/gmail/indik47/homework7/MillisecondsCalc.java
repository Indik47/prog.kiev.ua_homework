package com.gmail.indik47.homework7;

/*      Написать программу которая вернет количество миллисекунд
        прошедших от такого же числа, но в прошлом месяце до сегодняшней
        даты. Например если сегодня 3 августа, то узнать сколько миллисекунд
        прошло с 3 июля.
        */

import java.util.Calendar;

public class MillisecondsCalc {
    public static void main(String[] args) {
        System.out.println(msCalc()/(1000));
    }

    public static long msCalc() {
        Calendar clOneMonthBack = Calendar.getInstance();
        clOneMonthBack.set(Calendar.MONTH, clOneMonthBack.get(Calendar.MONTH) - 1);

        Calendar clCurrent = Calendar.getInstance();

        long ms = clCurrent.getTimeInMillis() - clOneMonthBack.getTimeInMillis();
        return ms;
    }
}
