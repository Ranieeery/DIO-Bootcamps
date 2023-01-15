package com.spring.first.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.text.DateFormat;
public class DateFormatJ {
    public static void main() {

        Date date = new Date();
        String dateToStr = DateFormat.getInstance().format(date);
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(date);
        System.out.println(dateToStr);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        String strDate = formatter.format(date);
        System.out.println(strDate);
        LocalDateJ.main();
    }
}
