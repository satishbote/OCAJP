package org.examlabs.oca1;

public class Q47Msg {
    public static String doMsg(char x)
    {
        //System.out.println("x "  + x);          // nothing is printing coz 8's ascii value is /b
        return"good day";
    }

    public static String doMsg(int z)
    {
        //System.out.println("z "  + z);      //56 is ascii of 8
        return"good luck";
    }

    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));   //good day
        System.out.println(doMsg(z));       //good luck
    }

}
