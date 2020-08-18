package org.examlabs.oca;

public class Q181 {

    public static void main(String[] args) {
        Q181 obj = new Q181();
        obj.doSum(10, 20);
        obj.doSum(10.0, 20.0);

    }

    public void doSum(int x, int y) {
        System.out.println("int sum is " + (x + y));
    }

    public void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y));
    }

    public void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }

    public void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }
}
    /*int sum is 30
        double sum is 30.0
        IMP Note:
        if int is not there then for int float will be called
        if float, double is not there then for int Integer will be called
        it means for primitive first preference given to primitive promotion then autoboxing*/
