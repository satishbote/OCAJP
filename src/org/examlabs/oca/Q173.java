package org.examlabs.oca;

public class Q173 {

    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking Card");
    }

    public static void main(String[] args) /*throws Exception*/ {
        Q173 obj= new Q173();
        int cardNo=12345;
        obj.checkCard(cardNo);
        //obj.readCard(cardNo);
    }
}
