package org.examlabs.oca1;

class Q60Sports
{
    int num_players;
    String name, ground_condition;

    Q60Sports(){

    }

    Q60Sports(int np, String sname, String sground)
    {
        num_players = np;
        name = sname;
        ground_condition = sground;
    }
}

class Cricket extends Q60Sports
{
    int num_umpires;
    int num_substitutes;

    Cricket()
    {
       /* super(11,"Cricket","ok");
        num_umpires = 3;
        num_substitutes = 7;*/

        /*super.ground_condition = "Condition OK";
        super.name="Cricket";
        super.num_players = 11;
        num_umpires =3; num_substitutes=2;*/

        /*super(11, "Cricket", "Condidtion OK");
        this.num_umpires =3; this.num_substitutes=2;*/
    }

    public static void main(String... a)
    {
    }

}

