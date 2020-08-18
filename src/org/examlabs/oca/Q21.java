package org.examlabs.oca1;

public class Q21 {
    String myStr="7007";
    public void doStuff(String str){
        int myNum=0;
        try{
            String myStr=str;
            myNum=Integer.parseInt(myStr);
        }catch(NumberFormatException nfe){
            System.out.println("Error");
        }
        System.out.println("myStr: "+myStr+" myNum: "+myNum);
    }

    public static void main(String[] args) {
        Q21 obj= new Q21();
        obj.doStuff("9009");
    }
}
