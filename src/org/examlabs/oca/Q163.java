package org.examlabs.oca;

class Product {
    int id;
    String name;
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    private void test() {
    }
}

public class Q163 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;

        System.out.println(p1 == p2);               //false
        System.out.println(p1.equals(p2));          //false
        System.out.println(p1.name.equals(p2.name));        //true
    }
}

