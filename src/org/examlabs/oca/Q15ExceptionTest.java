package org.examlabs.oca1;


class specialException extends Exception{
    public specialException(String message){
        super(message);
    }
}

public class Q15ExceptionTest {
    public static void main(String[] args) {
        try{
            doSomething();
        }catch(specialException e){
           // System.out.println(e);
            e.printStackTrace();
        }
    }
    static void doSomething() throws specialException{
        int[] ages= new int[4];
        ages[3]=17;
        doSomethingElse();
    }
    static void doSomethingElse() throws specialException{
        throw new specialException("thrown at the end of doSomething method");
    }
}
