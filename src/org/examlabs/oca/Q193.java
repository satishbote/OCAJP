package org.examlabs.oca;

public class Q193 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Duke");
        String str1=sb.toString();

        String str2=str1;
        //String str2 = sb.toString();
        //String str2 = "Duke";

        System.out.println(str1==str2);

    }
}
