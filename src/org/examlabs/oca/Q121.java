package org.examlabs.oca;

import java.util.ArrayList;
import java.util.List;

interface Contract{}

class Super implements Contract{}

class Sub extends Super{}

public class Q121 {
    public static void main(String[] args) {
        List obj = new ArrayList();

        Contract c1 = new Super();

        Contract c2 = new Sub();
        Super s1 = new Sub();
        Super s2 = new Super();

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
        /*ExamLabs.Super
        ExamLabs.Sub
        ExamLabs.Sub
        ExamLabs.Super*/

