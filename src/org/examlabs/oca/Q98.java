package org.examlabs.oca1;

public class Q98 {
    public static void main(String [] args){

    }

    private int i;
    void disp()
    {
        while (i <= 5)
        {
            for (int i=1; i <=5 ;)
            {
                System.out.print(i + " ");
                i++;
                i++;
            }
        }
    }
}
/*Output: 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1 3 5 1………………………forever
Here in for loop's var I scope will be limited till only for loop.
For while loop I will be always 0
*/