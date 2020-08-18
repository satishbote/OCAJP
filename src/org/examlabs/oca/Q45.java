package org.examlabs.oca1;

abstract class XX{
    public abstract void methodXX();
}

interface YY{
    public void methodYY();
}

/*class ZZ extends XX implements YY{
    public void methodZZ(){}
}*/

abstract class ZZ extends XX implements YY {
    public void methodZZ() {
    }
}

/*class ZZ extends XX implements YY {
    public void methodXX() {
    }
}*/

//abstract class ZZ extends XX implements YY {}    //works fine

/*class ZZ extends XX implements YY {
    public void methodYY() {
    }
}*/

public class Q45 {
}
