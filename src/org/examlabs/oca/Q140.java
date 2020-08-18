package org.examlabs.oca;

public class Q140 {

    public static void main(String arg[]) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" A ");
        }
    }

    static void method1() {
        try {
            //System.out.println(Math.random());
            /*double x=Math.random();
            System.out.println(x);
            throw x > 0.5 ? new Exception() : new RuntimeException();*/
            throw Math.random() > 0.5 ? new Exception() : new RuntimeException();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" B ");
        }
    }
}

