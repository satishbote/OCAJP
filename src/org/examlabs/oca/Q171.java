package org.examlabs.oca;


import java.util.ArrayList;
import java.util.List;

interface Contract11{}

class Super11 implements Contract11{}

class Sub11 extends Super11{}

public class Q171 {
    public static void main(String[] args) {
        List obj = new ArrayList();

        Contract11 c1 = new Super11();

        Contract11 c2 = new Sub11();
        Super11 s1 = new Sub11();
        Super11 s2 = new Super11();

        obj.add(c1);
        obj.add(c2);
        obj.add(s1);
        obj.add(s2);

        for(Object o : obj)
        {
            System.out.println(o.getClass().getName());
        }
    }
}