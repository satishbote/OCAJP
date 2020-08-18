package org.examlabs.oca;

import java.util.ArrayList;
import java.util.List;

public class Q135 {
    public static void main(String[] args) {
        List<String> lst= new ArrayList<String>();
        lst.add("Robb");
        lst.add("Bran");
        lst.add("Rick");
        lst.add("Bran");

        if(lst.remove("Bran")){   //object returns boolean and index returns String
            lst.remove("Jon");
        }

        System.out.println(lst);
    }
}
