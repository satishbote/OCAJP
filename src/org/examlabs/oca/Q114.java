package org.examlabs.oca;

public class Q114 {
    public static void main(String[] args) {
        String str1 = "Java";
        char str2[] = {'J', 'a', 'v', 'a'};
        String str3 = null;

        for (char c : str2) {
            str3 = str3 + c;
        }

        if (str1.equals(str3))
            System.out.println("Pass");
         else
            System.out.println("Fail");


        System.out.println(str1);
        System.out.println(str3);
    }
}

