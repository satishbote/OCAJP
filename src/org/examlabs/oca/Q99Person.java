package org.examlabs.oca1;

public class Q99Person {

    String name;
    int age=25;

    public Q99Person(String name){
        //this();
        setName(name);
    }
    public Q99Person(String name,int age){
        //Person(name);
        setName(name);
          setAge(age);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String Show(){
        return "Name "+name+" "+"Age "+age;
    }

    public static void main(String[] args) {
        Q99Person p1= new Q99Person("Satish");
        Q99Person p2= new Q99Person("Viraj",4);
        System.out.println(p1.Show());
        System.out.println(p2.Show());
    }
}
