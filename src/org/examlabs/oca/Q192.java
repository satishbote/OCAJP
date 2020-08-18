package org.examlabs.oca;

import java.util.ArrayList;

abstract class Animal{}
 interface Hunter{}
 class Cat extends Animal implements Hunter{}
 class Tiger extends Cat{}

public class Q192 {
    public static void main(String[] args) {
        ArrayList<Animal> al1=new ArrayList<>();
        al1.add(new Tiger());

        ArrayList<Hunter> al2=new ArrayList<>();
        al2.add(new Cat());

        ArrayList<Hunter> al3=new ArrayList<>();
        al3.add(new Tiger());

        ArrayList<Tiger> al4=new ArrayList<>();
       // al4.add(new Cat());

        ArrayList<Animal> al5=new ArrayList<>();
        al5.add(new Cat());






    }

}
