package org.examlabs.oca;

import java.time.LocalDate;
import java.time.Period;

public class Q186 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2015,3,26);
        Period p = Period.ofDays(1);
        System.out.println(d.plus(p));
    }
}
//2015-03-27

