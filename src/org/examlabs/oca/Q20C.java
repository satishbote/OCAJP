package org.examlabs.oca1;

class  A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }
}


public class Q20C  extends  B{

    public Q20C(){
        System.out.println("C");
    }
    public static void main(String[] args) {
        Q20C c= new Q20C();

    }
}
