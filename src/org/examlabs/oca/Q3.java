package org.examlabs.oca1;

public class Q3 {
    public static void main(String[] args) {
        boolean isChecked = false;
        int arry[] = {1, 3, 5, 7, 8, 9};
        int index = arry.length;
        System.out.println("arry length= "+index);
        while (index > 0) {
            if (arry[index - 1] % 2 == 0) {
                isChecked = true;
            }
                --index;
            //index--;
                System.out.println("index= "+index);
                System.out.println(arry[index] + ", " + isChecked);

        }
    }
}
