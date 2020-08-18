package org.examlabs.oca1;

public class Q24 {
    int x;
    int y;
    public void doStuff(int x, int y) {
        this.x = x;
        y =this.y;
    }
    public void display(){
        System.out.print(x + " " + y + " : ");
    }
    public static void main (String[]args){
        Q24 m1 = new Q24();
        m1.x = 100;
        m1.y = 200;
        Q24 m2 = new Q24();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}
