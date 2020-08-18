package org.examlabs.oca1;

class Employee1 {
    public int salary;
}

class Manager extends Employee1 {
    public int budget;
}

class Director extends Manager {
    public int stockoptions;
}


public class Q82 {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        Manager m = new Manager();
        Director d1 = new Director();
    }
}

