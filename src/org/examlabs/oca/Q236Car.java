package org.examlabs.oca;

class Vehicle{
    String type="4W";
    int maxSpeed=100;
    Vehicle(){

    }
    Vehicle(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }

}
public class Q236Car extends Vehicle{

    String trans;
    Q236Car(String trans){
        this.trans=trans;
    }
    Q236Car(String type,int maxSpeed, String trans){
        super(type,maxSpeed);
        //this(trans);
        this.trans=trans;

    }

    public static void main(String[] args) {
        Q236Car c1= new Q236Car("Auto");
        Q236Car c2= new Q236Car("4W",150,"Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
    }
}
