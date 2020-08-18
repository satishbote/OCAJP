package org.examlabs.oca1;

class MissingInfoException extends Exception{

}
class AgeOutofRangeException extends Exception{

}

class Candidate{
    String name;
    int age;

    Candidate(String name, int age) throws Exception /*throws MissingInfoException, AgeOutofRangeException*/{
        if(name==null){
            throw  new MissingInfoException();
        }else if(age<=20 || age>=150){
            throw new AgeOutofRangeException();
        }
        else{
            this.name=name;
            this.age=age;
        }
    }

    public String toString(){
        return name+" "+age;
    }
}

public class Q48 {
    public static void main(String[] args) throws Throwable /*throws Exception*/ /*throws MissingInfoException, AgeOutofRangeException*/ {
       // try {
            Candidate c = new Candidate("James", 20);
            Candidate c1 = new Candidate("Williams", 50);
            System.out.println(c);
            System.out.println(c1);
        /*}catch(MissingInfoException me){
        }
        catch(AgeOutofRangeException ae){
        }*/
        /*System.out.println(c);
        System.out.println(c1);*/
    }
}
