package org.examlabs.oca;

public class Q134 {
    public static void doChange(int[] arr){
        for(int i=0; i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }

    public static void main(String[] args) {
        int [] arr={10,20,30};
        doChange(arr);
        for (int x:arr ) {
            System.out.println(x);
        }
        doChange(new int[]{arr[0],arr[1],arr[2]});
        //doChange(arr);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
