package org.examlabs.oca;

public class Q143 {

    static int i;
    int j;

    public static void main(String[] args) {
        Q143 x1 = new Q143();
        Q143 x2 = new Q143();

        x1.i= 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
    }
}