package org.examlabs.oca;

public class Q102 {

    static String[][] arr =new String[3][];
    private static void doPrint() {
    //insert code here
        for(int i=0;i<=arr.length; i++){
            for(int j=arr[i].length-1;j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        String[] class1 = {"A","B","C"};
        String[] class2 = {"L","M","N","O"};
        String[] class3 = {"I","J"};
        arr[0] = class1;
        arr[1] = class2;
        arr[2] = class3;
        Q102.doPrint();
    }
}
