package org.examlabs.oca;
public class Q169 {
    public static void main(String[] args) {
        int row =10;
        for(; row > 0 ; )
        {
            int col = row;
            while (col >= 0)
            {
                System.out.println(col + " ");
                col -=2;            // 0-2 = -2
            }
            row = row / col;
        }
    }
}

