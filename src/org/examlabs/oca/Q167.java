package org.examlabs.oca;

import java.util.ArrayList;
import java.util.List;

public class Q167 {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(15);
        list.add(30);
        list.add(11);
        list.add(2);
        list.removeIf(e -> e%2 == 0);
        System.out.println(list);
    }
}

