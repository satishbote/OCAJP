package org.examlabs.oca;
class Root{
    private static final int MAX=20000;
    private int method1(){
        int a=100+MAX;
        return a;
    }
    private int method2(){
        int a= 200+MAX;
        return a;
    }
}


public class Q166 extends Root{
    public static void main(String[] args) {
        Root r1= new Q166();
        //System.out.println(r1.method1());
        //System.out.println(r1.method2());
    }

}
