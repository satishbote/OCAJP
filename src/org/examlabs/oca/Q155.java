package org.examlabs.oca;

class Alphas {
    public String main[] = new String[2];

    Alphas(String[] main) {
        for (int i = 0; i < main.length; i++) {
            this.main[i] = main[i] + 5;
        }
    }

    public void main() {
        System.out.println(main[0] + " " + main[1]);        //105 205
    }
}

public class Q155 {
    public static void main(String[] args) {
        Alphas main = new Alphas(args);
        main.main();
    }
}



