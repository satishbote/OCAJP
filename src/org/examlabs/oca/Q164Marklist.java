package org.examlabs.oca;

public class Q164Marklist {
    int num;

    public static void graceMarks(Q164Marklist obj4) {
        obj4.num += 10;
    }

    public static void main(String[] args) {
        Q164Marklist obj1 = new Q164Marklist();
        Q164Marklist obj2 = obj1;
        Q164Marklist obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
    }
}

/*when you do obj2 = obj1 you're copying object references - you're not making a copy of the
object - and so the variables e1 and e2 will both point to the same object.*/