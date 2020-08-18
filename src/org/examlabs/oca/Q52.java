package org.examlabs.oca1;

public class Q52 {

    public static void main(String[] args) {
        try {
            String[] arr = new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";
            for (String var : arr) {
                System.out.print(var + " ");
            }
        }catch(Exception e){
            System.out.print(e.getClass());
        }
    }
}
