package org.examlabs.oca1;

public class Q10Planet {
    public String name;
    public int moons;

    public Q10Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }


    public static void main(String[] args) {
        Q10Planet[] q10Planets = {
                new Q10Planet("Mercury", 0),
                new Q10Planet("Venus", 0),
                new Q10Planet("Earth", 1),
                new Q10Planet("Mars", 2)
        };
        System.out.println(q10Planets);            //[LTest.Planet;@4554617c
        System.out.println(q10Planets[2]);     //Test.Planet@74a14482
        System.out.println(q10Planets[2].moons);           //1

    }
}

