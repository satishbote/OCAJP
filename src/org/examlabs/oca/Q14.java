package org.examlabs.oca1;

import java.util.ArrayList;
import java.util.List;

class Student {
    int rollnumber;
    String name;
    List cources = new ArrayList();

    // insert code here
    Student(int i, String name, List cs){

    }

    public String toString() {
        return rollnumber + " : " + name + " : " + cources;
    }
}
public  class Q14 {
    public static void main(String[] args) {
        List cs = new ArrayList();
        cs.add("Java");
        cs.add("C");
        Student s = new Student(123, "Fred", cs);
        System.out.println(s);
                /*Which code fragment, when inserted at line // insert code here, enables class Test to print
                123 : Fred : [Java, C]?*/
    }
}