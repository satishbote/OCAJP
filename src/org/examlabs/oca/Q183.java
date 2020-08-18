package org.examlabs.oca;
public class Q183 {
    public static void main(String[] args) {
        String names[] = new String[3];

        names[0] = "Mary Brown";
        names[1] = "Nancy Red";
        names[2] = "Jessy Orange";

        try {
            for (String s : names) {
                try {
                    String pwd = s.substring(0, 3) + " " + s.substring(6, 10);
                    System.out.println(pwd);
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("string out of limits");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out bound limits");
        }
    }
}

