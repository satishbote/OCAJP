package org.examlabs.oca1;

public class Q97 {
    private int i;

    void disp() {
        while (i <= 5) {
            for (int i = 1; i <= 5; ) {
                System.out.print(i + " ");
                i++;
                i++;
            }
        }
    }
    public static void main(String[] args){
        new Q97().disp();

    }
}

