package org.examlabs.oca;

class MyString {
    String msg;
    MyString(String msg) {
        this.msg = msg;
    }
}

public class Q141 {
    public static void main(String arg[]) {
        System.out.println(new StringBuilder("Pankaj"));   //Pankaj
        System.out.println(new MyString("Pankaj"));     //ExamLabs.MyString@4554617c
    }
}

