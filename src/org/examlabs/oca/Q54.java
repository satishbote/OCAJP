package org.examlabs.oca1;


class Vehicle{
    int x;
    Vehicle(){
        this(10);
    }
    Vehicle(int x){
        this.x=x;
    }
}

class Car extends Vehicle{
    int y;
    Car(){
        this(20);
    }
    Car(int y){
        this.y=y;
    }

    public String toString(){
        return super.x+" "+this.y;
    }
}

public class Q54 {
    public static void main(String[] args) {
        Vehicle obj=new Car();
        System.out.println(obj);
    }
}
