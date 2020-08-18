package org.examlabs.oca1;

    class Product1 {
        double price;
    }

class Q39 {
    public void updatePrice(Product1 product , double price)
    {
        price = price * 2 ;
        product.price  = product.price + price;
    }
    public static void main(String arg[]) {
        Product1 prt = new Product1();
        prt.price = 200;
        double newPrice = 100;

        Q39 t = new Q39();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price + " " + newPrice );
    }
}

/*Ouput: 400.0 100.0
Check newPrice. We are just passing his value to function and no operations performing on this variable.
*/
