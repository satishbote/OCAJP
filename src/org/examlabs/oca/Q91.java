package org.examlabs.oca1;

public class Q91 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s="";



        if(sb.equals(s))
            System.out.println("Match1");
        else if(sb.toString().equals(s))
            System.out.println("Match2");
        else
            System.out.println("No Match");

        sb.append("satish");
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println(sb);
    }
}
