package org.examlabs.oca1;

class Student1 {
    int x;
}


public class Q81 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student1 s3 = new Student1();
        s1 = s3;
        s3 = s2;
        s2 = null;

/*        System.out.println("s1 " + s1.x);   //0
        System.out.println("s3 " + s3.x);   //0
        System.out.println("s2 " + s2.x);   //NullPointerException*/
    }
}

