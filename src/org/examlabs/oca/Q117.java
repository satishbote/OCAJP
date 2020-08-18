package org.examlabs.oca;

import java.util.ArrayList;
import java.util.List;

class Patient {
    String name;
    public Patient(String name){
        this.name=name;
    }
}
public class Q117 {
    public static void main(String[] args) {
        List ps= new ArrayList<>();
        Patient p2= new Patient("Mike");
        ps.add(p2);

        //insert here

        /*Patient p = new Patient ("Mike");
        int f = ps.indexOf(p);*/

        int f = ps.indexOf (new Patient("Mike"));

        if(f>=0);
        System.out.println("Mike Found");

    }
}
