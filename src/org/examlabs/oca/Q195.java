package org.examlabs.oca;

public class Q195 {
    static double area;
    int b=2,h=3;

    public static void main(String[] args) {

        double p,b,h;
        if(area==0){
            p=3;
            b=4;
            h=0.5;
        }
       // area=p*b*h;     //local variables must be initialised before use
        System.out.println("area is "+area);
    }
}
