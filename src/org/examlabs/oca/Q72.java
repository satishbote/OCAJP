package org.examlabs.oca1;

public class Q72 {
    public static void main(String[] args) {
        Q72 t = new Q72();
        try {
            t.doPrint();
            t.doList();

        } catch (Exception e) {
            System.out.println("Caught " + e);
        }
        System.out.println("Hello");
    }

    public void doList() throws Exception {
        throw new Error("Errors");
    }

    public void doPrint() throws  Exception /*RuntimeException*/  {
        //try {
            throw new RuntimeException("Exceptions");
        /*}catch(RuntimeException re){
            System.out.println("Caught exception inside doPrint");
        }*/
    }
}
    /*Caught exception inside doPrint
    Exception in thread "main" java.lang.Error: Errors
        at ExamLabs.Q72.doList(Q72.java:17)
        at ExamLabs.Q72.main(Q72.java:8)*/

