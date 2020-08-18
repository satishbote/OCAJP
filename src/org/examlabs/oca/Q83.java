package org.examlabs.oca1;

interface readable {
    public void readbook();
    public void setbookmark();
}

abstract class Book implements readable {
}

abstract public class Q83 extends Book {
    /// Q83 is either implement setbookmark method of interface or mark Q83 as abstract
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public void readbook() {
    }
}

