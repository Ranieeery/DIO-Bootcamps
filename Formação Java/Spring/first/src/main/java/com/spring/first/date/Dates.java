package com.spring.first.date;

import java.time.Instant;
import java.util.Date;

public class Dates {
    public static void main() {
        Date date = new Date(1610000000000L); // 01/01/2021 00:00:00 GMT-3
        System.out.println(date);

        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Date newDate = new Date(currentTimeMillis);
        System.out.println(newDate);

        System.out.println(date.after(newDate)); // Verifica se a data é posterior a outra
        System.out.println(date.before(newDate)); // Verifica se a data é anterior a data atual

        System.out.println(date.compareTo(newDate)); // Passado
        System.out.println(date.compareTo(date)); // Presente
        System.out.println(newDate.compareTo(date)); // Futuro

        System.out.println(date.equals(newDate));
        System.out.println(newDate.getTime());

        System.out.println(newDate);
        Instant instant = newDate.toInstant();
        System.out.println(instant);

    }
}
