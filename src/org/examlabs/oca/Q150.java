package org.examlabs.oca;

public class Q150 {
    public static  void main(String [] args) {
        float myarray[]={10.20f,20.30f,30.40f,40.50f};
        int index=0;
        boolean isFound=false;
        float key=30.40f;
        //insert here
        while(index<5){
            if(key==myarray[index++]) {
                isFound = true;
                break;
            }
            index++;
        }


        System.out.println(isFound);
    }

}
