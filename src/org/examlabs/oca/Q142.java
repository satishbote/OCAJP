package org.examlabs.oca;

import java.util.ArrayList;

class Alpha {
    public String doStuff(String msg){
        return msg;
    }
}

class Beta extends Alpha {
    public String doStuff(String msg) {
        return msg.replace('a','e');
    }
}

class Gamma extends Beta {
    public String doStuff(String msg) {
        return msg.substring(2);
    }
}

public class Q142 {
    public static void main(String arg[]) {
        java.util.List<Alpha> list = new ArrayList<Alpha>();
        list.add(new Alpha());
        list.add(new Beta());
        list.add(new Gamma());

        for (Alpha t : list) {
            System.out.println(t.doStuff("Java"));
        }

    }
}

