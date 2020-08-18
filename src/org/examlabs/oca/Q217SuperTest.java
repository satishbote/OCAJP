package org.examlabs.oca;

/*
What should statement1, statement2, and statement3, be respectively, in order to produce
the result?
Shape: constructor
Square: foo
Shape: foo
 */

public class Q217SuperTest {
    public static void main(String[] args) {
        //statement1
        //statement2
        // statement3
        //Square square = new Square ("bar"); square.foo ("bar"); square.foo();
        //Square square = new Square ("bar"); square.foo ("bar"); square.foo ("bar");
        //Square square = new Square (); square.foo (); square.foo("bar");
        //Square square = new Square (); square.foo (); square.foo ();
        Square square = new Square(); square.foo("bar"); square.foo();
    }
}
class Shape {
    public Shape() {
        System.out.println("Shape: constructor");
    }

    public void foo() {
        System.out.println("Shape: foo");
    }
}
class Square extends Shape {
    public Square() {
        super();
    }
    public Square(String label) {
        System.out.println("Square: constructor");
    }
    public void foo() {
        super.foo();
    }
    public void foo(String label) {
        System.out.println("Square: foo");
    }
}
