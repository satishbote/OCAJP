package org.examlabs.oca1;

public class Q66 {
    static void doubling (Integer ref, int pv) {
        ref = 20;
        pv = 20;
    }

    public static void main(String[] args)
    {
        Integer iObj = new Integer(10);
        int iVar = 10;
        doubling(iObj++, iVar++);
        System.out.println(iObj+ ", "+iVar);
    }

}

/*Output: 11 , 11
    iObj & iVar are increments by 1
*/
