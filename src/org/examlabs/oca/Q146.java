package org.examlabs.oca;

import java.util.ArrayList;

public class Q146 {
    public static void main(String[] args)
    {
        java.util.List<String> list =new ArrayList<String>();
        list.add("SE");
        list.add("EE");
        list.add("ME");
        list.add("SE");
        list.add("EE");
        list.remove("SE");
        System.out.println(list);
    }
}

