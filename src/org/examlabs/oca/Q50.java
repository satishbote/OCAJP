package org.examlabs.oca1;
public class Q50 {
    public static void main(String... args) {
        int x = 5;
        while (isAvailable(x))
        {
            //System.out.print(x);
               // x--;
            System.out.print(x--);
        }
    }
    public static boolean isAvailable(int x)
    {
        return  x-- > 0 ? true : false;
        //return  x > 0 ? true : false;
    }
}
    //infinite time 5555….

