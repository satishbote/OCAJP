package org.examlabs.oca1;

public class Q71 {
    int sum=0;
    public void doCheck(int number){
        if(number % 2 == 0){
            //break;
           // continue;
        }
        else{
            for(int i=0;i<number;i++){
                sum +=i;
            }
        }
    }
    public static void main(String[] args) {
      Q71 obj = new Q71();
        System.out.println("Red "+obj.sum);
        obj.doCheck(2);
        System.out.println("Orange "+obj.sum);
        obj.doCheck(3);
        System.out.println("Green "+obj.sum);
    }
}
