package org.examlabs.oca1;

public class Q63 {
    public static void main(String... args)
    {

        double discount = 0 ;
        int qty = Integer.parseInt("85");

        /*if(qty > 80 && qty < 90)
            discount = 0.2;
        else
            discount = 0;

        if(qty >= 90)
            discount = 0.5;
        else
            discount = 0;*/         //IN CORRECT


        if(qty >= 90)
            discount = 0.5;

        if(qty > 80 && qty < 90)
            discount = 0.2;               //CORRECT

        //discount = (qty >= 90 ) ?  0.5 : (qty > 80) ? 0.2 : 0 ;       //CORRECT

        System.out.println("discount is " + discount);
    }

}
