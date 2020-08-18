package org.examlabs.oca;

class X{
    public void mX(){
        System.out.println("Xm1");
    }
}
class Y extends X{
    public void mX(){
        System.out.println("Xm2");
    }
    public void mY(){
        System.out.println("Ym");
    }
}

public class Q123 {
    public static void main(String[] args) {
        X objx= new Y();
        Y objy= (Y)objx;
        objy.mY();
        objy.mX();
    }
}
