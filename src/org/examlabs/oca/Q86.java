package org.examlabs.oca1;

import java.util.ArrayList;
import java.util.List;

public class Q86 {
    public static List data = new ArrayList();

    static List Updates(String[] atrs) {
   // ArrayList static update(String [] strs){
        for (String s : atrs) {
            data.add(s + "  P");
        }
        return data;
    }


    public static void main(String[] args) {
        String d[] = {"a", "b", "c"};
        Q86.Updates(d);
        for (String s : d) {
            System.out.println(s);
        }
    }
}

