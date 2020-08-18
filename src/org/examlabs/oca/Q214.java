package org.examlabs.oca;

public class Q214 {
    static boolean isAvailable = false;

    public static void main(String[] args) {
        Q214 obj = new Q214();
        System.out.println(isAvailable);        //false
        isAvailable = doStuff();
        System.out.println(isAvailable);        //true
    }

    public static boolean doStuff()
    {
        return !isAvailable;
    }
}

