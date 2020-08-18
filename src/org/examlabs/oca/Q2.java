package org.examlabs.oca1;

public class Q2 {
    int fvar;
    static int cvar;
    public static void main(String[] args){
        Q2 t= new Q2();
        t.fvar=200;
        cvar=400;
       // fvar=200; cvar=400;
        //this.fvar=200;this.cvar=400;
        t.fvar = 200; Q2.cvar = 400;
        //this.fvar = 200; Q2.cvar = 400;
        System.out.println("Hello");
    }
}
