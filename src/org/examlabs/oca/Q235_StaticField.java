package org.examlabs.oca;

public class Q235_StaticField {
    static int i = 7;

    public static void main(String[] args) {
        Q235_StaticField obj = new Q235_StaticField();
        obj.i++;
        Q235_StaticField.i++;
        obj.i++;
        System.out.println(Q235_StaticField.i + " " + obj.i);
    }
}

