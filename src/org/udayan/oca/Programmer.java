package org.udayan.oca;

abstract class Writer{
    public void m1(){
        System.out.println("Writing...");
    }
}

class Author extends Writer{
    public void m1(){
        System.out.println("Writing Books...");
    }
}

public class Programmer extends Writer{

    public void m1() {
        System.out.println("Writing code...");
    }

    public static void main(String[] args){
        Writer w=new Programmer();
        w.m1();

    }
}
