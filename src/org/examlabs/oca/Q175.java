package org.examlabs.oca;

public class Q175 {
    public static void main(String[] args) {
        int [] lst={1,2,3,4,5,4,3,2,1};
        int sum=0;
        for(int i=0, j=lst.length-1;i< 5 && j>=5; i++,j--){
            sum=sum+lst[i]+lst[j];
        }
        System.out.println(sum);
    }
}
