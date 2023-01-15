package com.spring.first.date;

import java.util.Calendar;
public class CalendarJ {
    public static void main() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println("A data atual é: " + calendar.getTime());

        calendar.add(Calendar.DATE, 15);
        System.out.println("Daqui a 15 dias será: " + calendar.getTime());

        calendar.add(Calendar.MONTH, 8);
        System.out.println("8 meses depois: " + calendar.getTime());

        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + calendar.getTime());

        Calendar now = Calendar.getInstance();

        System.out.printf("%tc\n", now); // sáb. jan. 14 19:26:17 BRT 2023
        System.out.printf("%tF\n", now); // 2023-01-14
        System.out.printf("%tD\n", now); // 01/14/23
        System.out.printf("%tr\n", now); // 07:26:17 PM
        System.out.printf("%tT\n", now); // 19:26:17

        System.out.printf("%tA, %td de %tB de %tY\n", now, now, now, now); // sábado, 14 de janeiro de 2023
        DateFormatJ.main();

    }
}
