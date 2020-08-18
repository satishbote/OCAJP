package org.examlabs.oca;

import java.util.ArrayList;

public class Q145 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String[] mystr;
        try {
            while (true) {
                list.add("mystr");
            }
        } catch (RuntimeException e) {
            System.out.println("Caught Runtime");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
        System.out.println("ready to use");
    }
}
    //Infinite loop and then Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

