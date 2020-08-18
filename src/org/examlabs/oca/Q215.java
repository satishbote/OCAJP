package org.examlabs.oca;

public class Q215 {
    public static void main(String[] args) {
        float f1 = (12_345.01 >= 123_45.0) ? 12_456 : 124_56f ;     //12_456
        float f2 = f1 + 1024;       //13480.0
        System.out.println(f2);
    }
}

