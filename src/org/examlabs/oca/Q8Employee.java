package org.examlabs.oca1;

class Q8Employee
{
    String name;
    boolean contract;
    double salary;
    Q8Employee()
    {
        /*this.name = "Satish";
        this.contract = true;
        this.salary = 3423434;*/
    }
    public String toString()
    {
        return name + " : " + contract + " : " + salary;
    }
    public static void main(String[] agrs){
        Q8Employee e =new Q8Employee();
        e.name = "Viraj";
        e.contract = true;
        e.salary = 3423434;

        System.out.println(e);
    }
}

