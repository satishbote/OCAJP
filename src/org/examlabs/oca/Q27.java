package org.examlabs.oca1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q27 {
    public static void main(String[] args) {
    String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        //String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date);
    }
}
