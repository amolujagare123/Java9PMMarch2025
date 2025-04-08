package Inheritance.SuperDemo;

public class Employee {
    int salary = 35000;
    int bonus = 5000;
    void empWork()
    {
        System.out.println("empWork");
    }

    void calculateSalary()
    {
        System.out.println("Employee calculateSalary");
    }

    Employee()
    {
        System.out.println("Employee constructor");
    }

    Employee(int a)
    {
        System.out.println("Employee constructor with value="+a);
    }

    Employee(int a,int b)
    {
        System.out.println("Employee constructor with value="+a);
    }

}


class Programmer extends Employee
{
    int bonus = 15000;

    void programmerWork()
    {
        System.out.println("programmerWork");
    }
    void calculateSalary()
    {
        System.out.println("Programmer calculateSalary");
    }

    void display()
    {
        System.out.println("bonus="+bonus);
        System.out.println("bonus="+super.bonus);
        calculateSalary();
        super.calculateSalary();
    }

   /* Programmer()
    {
        super(23);
      //    super(23,56);
        System.out.println("inside programmer constructor");

    }
*/
    public static void main(String[] args) {

        Programmer p = new Programmer();

     // Employee e = new  Employee(6);


       // p.display();

    }
}
