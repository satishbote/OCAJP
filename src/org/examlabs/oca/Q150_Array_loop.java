package org.examlabs.oca;

public class Q150_Array_loop {
    public static void main(String[] args) {
        float[] myarray = {10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;

        while (index < 3) {
            if (key == myarray[index]) {
                isFound = true;
                break;
            }
            index++;
        }
        System.out.println(isFound);
    }
}

