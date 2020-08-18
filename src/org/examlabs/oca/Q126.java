package org.examlabs.oca;

class Alpha11{
    int ns;
    static int s;
    Alpha11(int ns){
        if(s<ns){
            s=ns;
            this.ns=ns;
        }
    }

    void doPrint(){
        System.out.println("ns= "+ns+" s "+s);
    }
}

public class Q126 {
    public static void main(String[] args) {
        Alpha11 ref1= new Alpha11(50);
        Alpha11 ref2= new Alpha11(125);
        Alpha11 ref3= new Alpha11(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }

}
