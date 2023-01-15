package com.spring.first.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateJ {
    public static void main() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tomorrow = localDate.plusDays(1);
        localDate = LocalDate.of(2021, 1, 1);
        System.out.println("Ontem: " + yesterday);
        System.out.println("Amanhã: " + tomorrow);
        System.out.println("Data teste: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime minus12Hours = localTime.minusHours(12);
        LocalTime plus3Hours = localTime.plusHours(3);
        LocalTime localTimeTest = LocalTime.of(12, 0, 0);
        System.out.println("12 horas atrás: " + minus12Hours);
        System.out.println("3 horas depois: " + plus3Hours);
        System.out.println("Hora teste: " + localTimeTest);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime minus1Day = localDateTime.minusDays(1);
        LocalDateTime plus1Day = localDateTime.plusDays(1);
        System.out.println("Ontem: " + minus1Day);
        System.out.println("Amanhã: " + plus1Day);

        LocalDateTime minus3Hours = localDateTime.minusHours(3);
        LocalDateTime plus12Hours = localDateTime.plusHours(12);
        LocalDateTime localDateTimeTest = LocalDateTime.of(2021, 1, 1, 12, 0, 0);
        System.out.println("3 horas atrás: " + minus3Hours);
        System.out.println("12 horas depois: " + plus12Hours);
        System.out.println("Data e hora teste: " + localDateTimeTest);

        LocalDateTime formattedDateTime = LocalDateTime.parse("2021-01-01T12:00:00");
        String formattedDateTimeString = formattedDateTime.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")); // 01/01/2021 12:00:00
        System.out.println("Data e hora formatada: " + formattedDateTimeString);

        System.out.printf("%d/%d/%d %d:%d:%d\n", localDateTime.getDayOfMonth(), localDateTime.getMonthValue(), localDateTime.getYear(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());

        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());

        System.out.println(localDateTime.isAfter(localDateTimeTest));
        System.out.println(localDateTime.isBefore(localDateTimeTest));
        System.out.println(localDateTime.isEqual(localDateTimeTest));

        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

        System.out.println(localDateTime.withDayOfMonth(1));
        System.out.println(localDateTime.withDayOfYear(1));
        System.out.println(localDateTime.withHour(1));

        System.out.println(localDateTime.with(java.time.temporal.TemporalAdjusters.firstDayOfMonth()));

        System.out.printf("%tF\n", localDateTime); // YYYY-MM-DD
        System.out.printf("%tD\n", localDateTime); // MM/DD/YY
        System.out.printf("%tr\n", localDateTime); // HH:MM:SS PM
        System.out.printf("%tT\n", localDateTime); // HH:MM:SS
        System.out.printf("%tR\n", localDateTime); // HH:MM
        System.out.printf("%td\n", localDateTime); // DD
        System.out.printf("%tB\n", localDateTime); // Mês por extenso
        System.out.printf("%tb\n", localDateTime); // Mês por extenso abreviado
        System.out.printf("%tA\n", localDateTime); // Dia da semana por extenso
        System.out.printf("%ta\n", localDateTime); // Dia da semana por extenso abreviado
        System.out.printf("%tY\n", localDateTime); // YYYY
        System.out.printf("%ty\n", localDateTime); // YY
        System.out.printf("%tH\n", localDateTime); // Hora (24h)
        System.out.printf("%tI\n", localDateTime); // Hora (12h)
        System.out.printf("%tk\n", localDateTime); // Hora (24h) sem zero à esquerda
        System.out.printf("%tl\n", localDateTime); // Hora (12h) sem zero à esquerda
        System.out.printf("%tM\n", localDateTime); // MM
        System.out.printf("%tS\n", localDateTime); // SS
        System.out.printf("%tL\n", localDateTime); // MS
        System.out.printf("%tN\n", localDateTime); // Microsegundos (9 dígitos)
        System.out.printf("%tp\n", localDateTime); // AM/PM
        System.out.printf("%tC\n", localDateTime); // Século
        System.out.printf("%tj\n", localDateTime); // Dia do ano (1~365/366)

        System.out.printf("%tA, %td de %tB de %tY\n", localDateTime, localDateTime, localDateTime, localDateTime);
        // Segunda-feira, 04 de Janeiro de 2021

        System.out.println(localDateTime.format(java.time.format.DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", new java.util.Locale("pt", "BR"))));
        // ↑ Depreciado
    }
}