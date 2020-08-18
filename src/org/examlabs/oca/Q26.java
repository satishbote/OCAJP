package org.examlabs.oca1;

public class Q26 {
    private char var;
    public static void main(String arg[]) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Q26 t1 = new Q26();
        Q26 t2 = t1;

        //here t1 assigns to t2. Hence both objects are equal
        t1.var = 'i';
        // System.out.println(t1.var + " " + t2.var);	// i i
        t2.var = 'o';

        System.out.println(var1 + " " + var2);		//a e
        System.out.println(t1.var + " " + t2.var);		// o	o

    }
    //Output : a e o o

}
