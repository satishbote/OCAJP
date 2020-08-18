package org.examlabs.oca1;

import java.util.ArrayList;
import java.util.List;

public class Q75 {
    public static void main(String args[]) {
        List<Integer> Numbers = new ArrayList<>();

        //Type argument cannot be of primitive type List<int> Numbers = new ArrayList<>()

        // Add Number to list
        Numbers.add(21);
        Numbers.add(13);
        Numbers.add(30);
        Numbers.add(11);

        Numbers.removeIf(e -> e%2!=0);

        // print list
        for (int i : Numbers) {
            System.out.println(i);
        }
    }
}
