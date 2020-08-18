package org.examlabs.oca1;

public class Q46 {
    public static void main(String[] args) {
        int[][] num =new int[1][3];


        // System.out.println(num[0].length);
        // System.out.println(num[1].length);


        for(int i = 0 ; i < num.length ; i++)
        {
            System.out.println(num[i].length);
            for(int j = 0 ; j < num[i].length ; j++ )
            {
                num[i][j] = 10;
            }
        }
        System.out.println(num);

    }

}
